/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joesystem.collectionstudy;

import java.util.Arrays;
import java.util.Collection;
import java.util.*;
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
public class CollectionsAlgImplTest {
    
    public CollectionsAlgImplTest() {
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
     * Test of sort method, of class CollectionsAlgImpl.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        CollectionsAlgImpl instance = new CollectionsAlgImpl();
        String[] expResult = {"asd","bsd", "csddd"};
        
        String[] strArr = {"csddd","bsd","asd"};
        List<String> strCol = new ArrayList<>(Arrays.asList(strArr));
        Collection result = instance.sort(strCol);
        
        
        assertArrayEquals(expResult, result.toArray(new String[0]));
    }

//    
//    
//    /**
//     * Test of shuffle method, of class CollectionsAlgImpl.
//     */
//    @Test
//    public void testShuffle() {
//        System.out.println("shuffle");
//        CollectionsAlgImpl instance = new CollectionsAlgImpl();
//        Collection expResult = null;
//        Collection result = instance.shuffle();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /*
//    /**
//     * Test of reverse method, of class CollectionsAlgImpl.
//     */
//    @Test
//    public void testReverse() {
//        System.out.println("reverse");
//        CollectionsAlgImpl instance = new CollectionsAlgImpl();
//        Collection expResult = null;
//        Collection result = instance.reverse();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of rotate method, of class CollectionsAlgImpl.
//     */
//    @Test
//    public void testRotate() {
//        System.out.println("rotate");
//        CollectionsAlgImpl instance = new CollectionsAlgImpl();
//        Collection expResult = null;
//        Collection result = instance.rotate();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of swap method, of class CollectionsAlgImpl.
//     */
//    @Test
//    public void testSwap() {
//        System.out.println("swap");
//        CollectionsAlgImpl instance = new CollectionsAlgImpl();
//        Collection expResult = null;
//        Collection result = instance.swap();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of replaceAll method, of class CollectionsAlgImpl.
//     */
//    @Test
//    public void testReplaceAll() {
//        System.out.println("replaceAll");
//        CollectionsAlgImpl instance = new CollectionsAlgImpl();
//        Collection expResult = null;
//        Collection result = instance.replaceAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of fill method, of class CollectionsAlgImpl.
//     */
//    @Test
//    public void testFill() {
//        System.out.println("fill");
//        CollectionsAlgImpl instance = new CollectionsAlgImpl();
//        Collection expResult = null;
//        Collection result = instance.fill();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of copy method, of class CollectionsAlgImpl.
//     */
//    @Test
//    public void testCopy() {
//        System.out.println("copy");
//        CollectionsAlgImpl instance = new CollectionsAlgImpl();
//        Collection expResult = null;
//        Collection result = instance.copy();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of binarySearch method, of class CollectionsAlgImpl.
//     */
//    @Test
//    public void testBinarySearch() {
//        System.out.println("binarySearch");
//        CollectionsAlgImpl instance = new CollectionsAlgImpl();
//        Collection expResult = null;
//        Collection result = instance.binarySearch();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of indexOfSubList method, of class CollectionsAlgImpl.
//     */
//    @Test
//    public void testIndexOfSubList() {
//        System.out.println("indexOfSubList");
//        CollectionsAlgImpl instance = new CollectionsAlgImpl();
//        int expResult = 0;
//        int result = instance.indexOfSubList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of lastIndexOfSubList method, of class CollectionsAlgImpl.
//     */
//    @Test
//    public void testLastIndexOfSubList() {
//        System.out.println("lastIndexOfSubList");
//        CollectionsAlgImpl instance = new CollectionsAlgImpl();
//        int expResult = 0;
//        int result = instance.lastIndexOfSubList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    
}
