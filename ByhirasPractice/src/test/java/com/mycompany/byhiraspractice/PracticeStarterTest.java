/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.byhiraspractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author jpaisley
 */
public class PracticeStarterTest {
    
    private PracticeStarter instance;
    
    public PracticeStarterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        instance = new PracticeStarter();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class PracticeStarter.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PracticeStarter.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateAndOutputNumbers method, of class PracticeStarter.
     */
    @Test
    public void testCalculateAndOutputNumbers() {
        
        Calculator cal = mock(Calculator.class);
        instance.setCalculator(cal);
        
        
        when(cal.addNumbers(anyInt(),anyInt())).thenReturn(6);
        System.out.println("calculateAndOutputNumbers");
        int i = 0;
        int j = 0;
        instance.calculateAndOutputNumbers(i, j);
        
    }
    
}
