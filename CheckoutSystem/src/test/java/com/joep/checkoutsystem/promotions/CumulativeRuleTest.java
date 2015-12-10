/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joep.checkoutsystem.promotions;

import com.joep.checkoutsystem.Item;
import com.joep.checkoutsystem.promotions.CumulativeRule;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
public class CumulativeRuleTest {
    
    public CumulativeRuleTest() {
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
    public void testCalculateDeductionWithMatch() {
        System.out.println("testCalculateDeductionWithMatch");
        List<Item> items = new ArrayList<>();
        Item item1 = new Item("001", "Travel Card Holder", new BigDecimal("9.25").multiply(BigDecimal.valueOf(100)).longValue());
        Item item2 = new Item("002", "Personalised Cufflinks", new BigDecimal("45.00").multiply(BigDecimal.valueOf(100)).longValue());
        Item item3 = new Item("003", "Kids T-Shirt", new BigDecimal("19.95").multiply(BigDecimal.valueOf(100)).longValue());
        
        items.add(item1);
        items.add(item2);
        items.add(item1);
        
        CumulativeRule rule = new CumulativeRule("001", 2, 925, 850);
        
        
        long expResult = 150l;
        long result = rule.calculateDeduction(items);
        assertTrue(expResult==result);
    }
    

    
    @Test
    public void testCalculateDeductionWithNoMatch() {
        System.out.println("testCalculateDeductionWithNoMatch");
        List<Item> items = new ArrayList<>();
        Item item1 = new Item("001", "Travel Card Holder", new BigDecimal("9.25").multiply(BigDecimal.valueOf(100)).longValue());
        Item item2 = new Item("002", "Personalised Cufflinks", new BigDecimal("45.00").multiply(BigDecimal.valueOf(100)).longValue());
        Item item3 = new Item("003", "Kids T-Shirt", new BigDecimal("19.95").multiply(BigDecimal.valueOf(100)).longValue());
        
        items.add(item1);
        items.add(item2);
        items.add(item2);
        
        CumulativeRule rule = new CumulativeRule("001", 2, 925, 850);
        
        
        long expResult = 0l;
        long result = rule.calculateDeduction(items);
        assertTrue(expResult==result);
    }
    
}
