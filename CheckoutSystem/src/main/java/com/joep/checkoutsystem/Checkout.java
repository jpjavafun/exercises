/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joep.checkoutsystem;

import com.joep.checkoutsystem.promotions.ItemRule;
import com.joep.checkoutsystem.promotions.PriceRule;
import com.joep.checkoutsystem.promotions.PromotionalRules;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpaisley
 */
public class Checkout {
    
    List<Item> items;
    
    PromotionalRules rules;
    
    Checkout(PromotionalRules promotionalRules){
        
        //Our list of added items
        this.items = new ArrayList<>();
        //Our active promotions
        this.rules = promotionalRules;
        
        
    }
    
    
    public void scan(Item item){
        items.add(item);
    }

    
    public double total(){
        
       long itemsTotal = 0l;
       long itemDeductions = 0l;
       long priceDeductions = 0l;
       long finalTotal = 0l;
       
       //Calculate total for all items
       itemsTotal = calculateTotalForItems();
       
       //Using active item promotions calculate
       //deductions on specific items.
       itemDeductions = calculateItemDeductions();
       
       //Subtract item deductions from final total
       finalTotal = itemsTotal - itemDeductions;
       
       //Using active price promotions calculate
       //deductions.
       priceDeductions = calculatePriceDeductions(finalTotal);
       
       //Subtract price reductions from final total.
       finalTotal = finalTotal - priceDeductions;
       
       //Convert to double for final value.
       double result = BigDecimal.valueOf(finalTotal).divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP).doubleValue();
       
       return result;
       
        
    }
    
    
    private long calculateTotalForItems(){
        
        //loop through items adding price
        long total= 0l;
        
        for(Item it : items){   
            total += it.getPrice();
        }
        
        return total;
        
    }
    
    
    private long calculateItemDeductions(){
        
        //loop through item rules adding
        //valid reductions
        long total= 0l;
        
        for(ItemRule rule : rules.getItemRules()){   
            total += rule.calculateDeduction(items);
        }
        
        return total;
        
    }
    
    
    private long calculatePriceDeductions(long totalAmount){
        
        //loop through price rules adding
        //valid reductions
        long total= 0l;
        
        for(PriceRule rule : rules.getPriceRules()){   
            total += rule.calculateDeduction(totalAmount);
        }
        
        return total;
        
    }
    
    
}
