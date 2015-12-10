/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.skypractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author jpaisley
 */
public class StarterTest {
    
    public StarterTest() {
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

    /**
     * Test of main method, of class Starter.
     */
    @Test
    public void testMain() {
        
        
        Starter.MyA a = mock(Starter.MyA.class);
        when(a.getInt()).thenReturn(77);
        
        
        
        
        System.out.println("main");
        String[] args = null;
        Starter.main(args);
        
        Starter s = new Starter();
        Starter.MyA bb = s.new MyA();
        assertEquals(bb.getInt(), 77);
    }

    
}
