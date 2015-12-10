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

/**
 *
 * @author jpaisley
 */
public class MyLLTest {
    
    public MyLLTest() {
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
     * Test of addNode method, of class MyLL.
     */
    @Test
    public void testAddNode() {
        System.out.println("addNode");
        Object data1 = 1;
        Object data2 = 2;
        Object data3 = 3;
        MyLL instance = new MyLL();
        MyLL.Node result1 = instance.addNode(data1);
        MyLL.Node result2 = instance.addNode(data2);
        MyLL.Node result3 = instance.addNode(data3);
        
        String expResult = "3-2-1-";
        String actResult = instance.outputList();
       
        assertEquals(expResult, actResult);
        
    }

    /**
     * Test of removeNode method, of class MyLL.
     */
    @Test
    public void testRemoveNode() {
        System.out.println("removeNode");
        Object data1 = 1;
        Object data2 = 2;
        Object data3 = 3;
        Object data4 = 4;
        MyLL instance = new MyLL();
        MyLL.Node result1 = instance.addNode(data1);
        MyLL.Node result2 = instance.addNode(data2);
        MyLL.Node result3 = instance.addNode(data3);
        MyLL.Node result4 = instance.addNode(data4);
        
        instance.removeNode(data3);
        
        String expResult = "4-2-1-";
        String actResult = instance.outputList();
       
        assertEquals(expResult, actResult);
        
        //remove head
        instance.removeNode(data4);
        
        String expResult2 = "2-1-";
        String actResult2 = instance.outputList();
       
        assertEquals(expResult2, actResult2);
        
        
        instance.removeNode(data1);
        
        String expResult3 = "2-";
        String actResult3 = instance.outputList();
        
        assertEquals(expResult3, actResult3);
        
        
    }

    /**
     * Test of outputList method, of class MyLL.
     */
    @Test
    public void testOutputList() {
        System.out.println("outputList");
        MyLL instance = new MyLL();
        instance.addNode(1);
        instance.addNode(2);
        instance.addNode(3);
        
        assertEquals("3-2-1-",instance.outputList());
        
    }
    
}
