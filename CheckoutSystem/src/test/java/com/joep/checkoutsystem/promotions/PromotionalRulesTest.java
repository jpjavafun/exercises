/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joep.checkoutsystem.promotions;

import java.math.BigDecimal;
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
public class PromotionalRulesTest {
    
    public PromotionalRulesTest() {
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


    
    @Test (expected = IllegalArgumentException.class)
    public void testCreateCumulativeRuleWithInvalidParams() {
        System.out.println("testCreateCumulativeRuleWithInvalidParams");
       
        PromotionalRules instance = new PromotionalRules();
        
        instance.createCumulativeRule("", 0, 4, 5);

    }

    
    @Test (expected = IllegalArgumentException.class)
    public void testCreateTotalSpendRuleWithInvalidParams() {
        System.out.println("testCreateTotalSpendRuleWithInvalidParams");
      
        BigDecimal perc = new BigDecimal("-1");
        PromotionalRules instance = new PromotionalRules();
        instance.createTotalSpendRule(100, perc);
       
    }
    
}
