/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.mockproject;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author jpaisley
 */
@RunWith(MockitoJUnitRunner.class) 
public class MockAnnotationTest {
    
    
    
    @Mock
    private RepositoryClass rep;
    
    @Mock
    private ClassA classa;
    
    @InjectMocks
    private ClassUnderTest testingObject;
 
    
    @Before
    public void beforeMockTest(){
      
        MockitoAnnotations.initMocks(this);
        
        
    }
    
    
    @Test
    public void testMyClass(){
        
        System.out.println("doSomething");
        ClassUnderTest instance = null;
        
        when(rep.getString()).thenReturn("Joe");
        
        instance = new ClassUnderTest(rep);
        
        String expResult = "JoeJoe";
        String result = instance.doSomething();
        assertEquals(expResult, result);
        
        
    }
    
    @Test
    public void testMyClassA(){
        
        System.out.println("doSomethingWithClassA");
        //ClassUnderTest instance = null;
        
        Mockito.when(classa.getString()).thenReturn("GooGoo");
        
        //instance = new ClassUnderTest(rep);
        
        String expResult = "GooGoo";
        String result = testingObject.doSomethingAgain();
        assertEquals(expResult, result);
        
        
    }
    
}
