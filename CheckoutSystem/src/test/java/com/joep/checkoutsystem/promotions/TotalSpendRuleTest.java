/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joep.checkoutsystem.promotions;

import com.joep.checkoutsystem.promotions.TotalSpendRule;
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
public class TotalSpendRuleTest {
    
    public TotalSpendRuleTest() {
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
 
        TotalSpendRule rule = new TotalSpendRule(6000, new BigDecimal("10"));
 
        long expResult =742l;
        long result = rule.calculateDeduction(7425);
        assertTrue(expResult==result);
    }
    
  
    
    @Test
    public void testCalculateDeductionWithNoMatch() {
        System.out.println("testCalculateDeductionWithNoMatch");
            
        TotalSpendRule rule = new TotalSpendRule(6000, new BigDecimal("10"));
 
        long expResult =0l;
        long result = rule.calculateDeduction(3500);
        assertTrue(expResult==result);
    }
    
}
