/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joep.checkoutsystem;

import com.joep.checkoutsystem.promotions.PromotionalRules;
import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author jpaisley
 */
public class StartCheckout {
    
    
    public static void main(String[] args){
        
        
        BigDecimal mult = new BigDecimal("100");
        Item item1 = new Item("001", "Travel Card Holder", new BigDecimal("9.25").multiply(mult).longValue());
        Item item2 = new Item("002", "Personalised Cufflinks", new BigDecimal("45.00").multiply(mult).longValue());
        Item item3 = new Item("003", "Kids T-Shirt", new BigDecimal("19.95").multiply(mult).longValue());
        
        PromotionalRules promotions = new PromotionalRules();
        promotions.createCumulativeRule("001", 2, 925, 850);
        promotions.createTotalSpendRule(6000, new BigDecimal("10"));
       
        
        Checkout checkout = new Checkout(promotions);
        System.out.println("Checkout initialised");
        checkout.scan(item1);
        System.out.println("Scanning item:"+item1.getDesc());
        checkout.scan(item2);
        System.out.println("Scanning item:"+item2.getDesc());
        checkout.scan(item1);
        System.out.println("Scanning item:"+item1.getDesc());
        checkout.scan(item3);
        System.out.println("Scanning item:"+item3.getDesc());
        
        
        double result = checkout.total();
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String resultString = formatter.format(result);
        System.out.println("Total:"+resultString);
        
        
    }
    
}
