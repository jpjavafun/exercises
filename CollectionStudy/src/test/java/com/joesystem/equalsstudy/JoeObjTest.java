/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joesystem.equalsstudy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;
/**
 *
 * @author jpaisley
 */
public class JoeObjTest {
    
    public JoeObjTest() {
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
     * Test of equals method, of class JoeObj.
     */
    @Test
    public void testEqualsWithNull() {
        System.out.println("equals");
      
        JoeObj j = new JoeObj(2,2);
        
        boolean expResult = false;
        boolean result = j.equals(null);
        
        assertFalse(result);
    }

  /**
     * Test of equals method, of class JoeObj.
     */
    @Test
    public void testEqualsWithSameClassDiffValues() {
        System.out.println("equals");
      
        JoeObj j = new JoeObj(2,2);
        JoeObj k = new JoeObj(2,1);
        
        boolean result = j.equals(k);
        
        assertFalse(result);
    }    
    
 @Test
    public void testEqualsWithSameClassSameValues() {
        System.out.println("equals");
      
        JoeObj j = new JoeObj(2,2);
        JoeObj k = new JoeObj(2,2);
        
        boolean result = j.equals(k);
        
        assertTrue(result);
    }    
 
    @Test
    public void testEqualsWithDiffClass() {
        System.out.println("equals");
      
        JoeObj j = new JoeObj(2,2);
        Object k = new Object();
        System.out.println(k.getClass());
        
        boolean result = j.equals(k);
        
         assertFalse(result);
    }     
    
    
    @Test
    public void testEqualsWithDiffReference() {
        System.out.println("equals");
      
        JoeObj j = new JoeObj(2,2);
        JoeObj k = j;
        System.out.println(k.getClass());
        
        boolean result = j.equals(k);
        
         assertTrue(result);
    }     
    
    
    
    
    
    
    
    /**
     * Test of hashCode method, of class JoeObj.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        JoeObj j = new JoeObj(2,2);
        JoeObj k = new JoeObj(2,2);
        int result1 = j.hashCode();
        int result2 = k.hashCode();
        assertEquals(result1, result2);
    }
    
}
