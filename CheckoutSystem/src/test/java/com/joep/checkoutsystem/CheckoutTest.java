/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joep.checkoutsystem;

import com.joep.checkoutsystem.promotions.CumulativeRule;
import com.joep.checkoutsystem.promotions.TotalSpendRule;
import com.joep.checkoutsystem.promotions.PromotionalRules;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jpaisley
 */
public class CheckoutTest {
    
    public CheckoutTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    
    @Test
    public void testCheckoutWithNoPromotions() {
        System.out.println("testCheckoutWithNoPromotions");
        
        BigDecimal mult = new BigDecimal("100");
        Item item1 = new Item("001", "Travel Card Holder", new BigDecimal("9.25").multiply(mult).longValue());
        Item item2 = new Item("002", "Personalised Cufflinks", new BigDecimal("45.00").multiply(mult).longValue());
        Item item3 = new Item("003", "Kids T-Shirt", new BigDecimal("19.95").multiply(mult).longValue());
        
        
        PromotionalRules promotions = new PromotionalRules();
        
        Checkout checkout = new Checkout(promotions);
        checkout.scan(item1);
        checkout.scan(item2);
        checkout.scan(item3);
        
        double expResult = 74.2;
        
        double result = checkout.total();
        
        assertEquals(expResult,result,0);
    }
    
  
    
    @Test
    public void testCheckoutWithCumulativeMatch() {
        System.out.println("testCheckoutWithCumulativeMatch");
        
        BigDecimal mult = new BigDecimal("100");
        Item item1 = new Item("001", "Travel Card Holder", new BigDecimal("9.25").multiply(mult).longValue());
        Item item2 = new Item("002", "Personalised Cufflinks", new BigDecimal("45.00").multiply(mult).longValue());
        Item item3 = new Item("003", "Kids T-Shirt", new BigDecimal("19.95").multiply(mult).longValue());
        
        PromotionalRules promotions = new PromotionalRules();
        promotions.createCumulativeRule("001", 2, 925, 850);
        promotions.createTotalSpendRule(6000, new BigDecimal("10"));
        
        
        
        Checkout checkout = new Checkout(promotions);
        checkout.scan(item1);
        checkout.scan(item3);
        checkout.scan(item1);
        
        double expResult = 36.95;
        
        double result = checkout.total();
        
        assertEquals(expResult,result,0);
    }


    
    @Test
    public void testCheckoutWithTotalSpendMatch() {
        System.out.println("testCheckoutWithTotalSpendMatch");
        BigDecimal mult = new BigDecimal("100");
        
        Item item1 = new Item("001", "Travel Card Holder", new BigDecimal("9.25").multiply(mult).longValue());
        Item item2 = new Item("002", "Personalised Cufflinks", new BigDecimal("45.00").multiply(mult).longValue());
        Item item3 = new Item("003", "Kids T-Shirt", new BigDecimal("19.95").multiply(mult).longValue());
        
        PromotionalRules promotions = new PromotionalRules();
        promotions.createCumulativeRule("001", 2, 925, 850);
        promotions.createTotalSpendRule(6000, new BigDecimal("10"));
        
        Checkout checkout = new Checkout(promotions);
        checkout.scan(item1);
        checkout.scan(item2);
        checkout.scan(item3);
        
        double expResult = 66.78;
        
        double result = checkout.total();
        
        assertEquals(expResult,result,0);
    }
    

    
    @Test
    public void testCheckoutWithTotalSpendAndCumulativeMatch() {
        System.out.println("testCheckoutWithTotalSpendAndCumulativeMatch");
        BigDecimal mult = new BigDecimal("100");
        
        Item item1 = new Item("001", "Travel Card Holder", new BigDecimal("9.25").multiply(mult).longValue());
        Item item2 = new Item("002", "Personalised Cufflinks", new BigDecimal("45.00").multiply(mult).longValue());
        Item item3 = new Item("003", "Kids T-Shirt", new BigDecimal("19.95").multiply(mult).longValue());
        
        PromotionalRules promotions = new PromotionalRules();
        promotions.createCumulativeRule("001", 2, 925, 850);
        promotions.createTotalSpendRule(6000, new BigDecimal("10"));
       
        
        Checkout checkout = new Checkout(promotions);
        checkout.scan(item1);
        checkout.scan(item2);
        checkout.scan(item1);
        checkout.scan(item3);
        
        
        double expResult = 73.76;
        
        double result = checkout.total();
        
        assertEquals(expResult,result,0);
    }
    
}
