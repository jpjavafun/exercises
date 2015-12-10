/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.mockproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 *
 * @author jpaisley
 */
public class ClassUnderTestTest {
    
    public ClassUnderTestTest() {
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
     * Test of doSomething method, of class ClassUnderTest.
     */
    @Test
    public void testDoSomething() {
        
        
        System.out.println("doSomething");
        ClassUnderTest instance = null;
        
        RepositoryClass test = Mockito.mock(RepositoryClass.class);
        
        when(test.getString()).thenReturn("Joe");
        
        instance = new ClassUnderTest(test);
        
        String expResult = "JoeJoe";
        String result = instance.doSomething();
        assertEquals(expResult, result);
    }
    
}
