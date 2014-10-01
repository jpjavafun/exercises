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

    
    
    /**
     * Test of shuffle method, of class CollectionsAlgImpl.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        CollectionsAlgImpl instance = new CollectionsAlgImpl();
        String[] expResult = {"asd","bsd", "csddd"};
        
       
        List<String> strCol = new ArrayList<>(Arrays.asList(expResult));
        Collection result = instance.shuffle(strCol);
        
        
        assertNotEquals(expResult, result.toArray(new String[0]));
    }

    /*
    /**
     * Test of reverse method, of class CollectionsAlgImpl.
     */
    @Test
    public void testReverse() {
        System.out.println("sort");
        CollectionsAlgImpl instance = new CollectionsAlgImpl();
        String[] expResult = {"asd","bsd", "csddd"};
        
        String[] strArr = {"csddd","bsd","asd"};
        List<String> strCol = new ArrayList<>(Arrays.asList(strArr));
        Collection result = instance.reverse(strCol);
        
        
        assertArrayEquals(expResult, result.toArray(new String[0]));
    }

    /**
     * Test of rotate method, of class CollectionsAlgImpl.
     */
    @Test
    public void testRotate() {
       System.out.println("sort");
        CollectionsAlgImpl instance = new CollectionsAlgImpl();
        String[] expResult = {"bsd","asd", "csdd"};
        
        String[] strArr = {"csdd","bsd","asd"};
        List<String> strCol = new ArrayList<>(Arrays.asList(strArr));
        Collection result = instance.rotate(strCol,2);
        
        assertArrayEquals(expResult, result.toArray(new String[0]));
    }

    /**
     * Test of swap method, of class CollectionsAlgImpl.
     */
    @Test
    public void testSwap() {
        System.out.println("sort");
        CollectionsAlgImpl instance = new CollectionsAlgImpl();
        String[] expResult = {"csdd","asd", "bsd"};
        
        String[] strArr = {"csdd","bsd","asd"};
        List<String> strCol = new ArrayList<>(Arrays.asList(strArr));
        Collection result = instance.swap(strCol,1,2);
        
        assertArrayEquals(expResult, result.toArray(new String[0]));
    }

    /**
     * Test of replaceAll method, of class CollectionsAlgImpl.
     */
    @Test
    public void testReplaceAll() {
         System.out.println("sort");
        CollectionsAlgImpl instance = new CollectionsAlgImpl();
        String[] expResult = {"one","two", "one"};
        
        String[] strArr = {"csdd","bsd","asd"};
        List<String> strCol = new ArrayList<>(Arrays.asList(strArr));
        Collection result = instance.replaceAll(strCol,"csdd","one");
        result = instance.replaceAll(strCol,"asd","one");
        result = instance.replaceAll(strCol,"bsd","two");
        
        assertArrayEquals(expResult, result.toArray(new String[0]));
    }

    /**
     * Test of fill method, of class CollectionsAlgImpl.
     */
    @Test
    public void testFill() {
        System.out.println("fill");
       CollectionsAlgImpl instance = new CollectionsAlgImpl();
        String[] expResult = {"test","test","test"};
       
        
        String[] strArr =  {"csdd","asd", "bsd"};
        List<String> strCol = new ArrayList<>(Arrays.asList(strArr));
        Collection result = instance.fill(strCol,"test");
        
        assertArrayEquals(expResult, result.toArray(new String[0]));
    }

    /**
     * Test of copy method, of class CollectionsAlgImpl.
     */
    @Test
    public void testCopy() {
        System.out.println("copy");
        CollectionsAlgImpl instance = new CollectionsAlgImpl();
        String[] expResult = {"four","five", "six"};
        
        String[] strArr = {"one","two","three"};
        List<String> strCol = new ArrayList<>(Arrays.asList(strArr));
        
        String[] strArr2 = {"four","five","six"};
        List<String> strCol2 = new ArrayList<>(Arrays.asList(strArr2));
        
        Collection result = instance.copy(strCol,strCol2);
        
        assertArrayEquals(expResult, result.toArray(new String[0]));
    }

    /**
     * Test of binarySearch method, of class CollectionsAlgImpl.
     */
    @Test
    public void testBinarySearch() {
        System.out.println("binarySearch");
        CollectionsAlgImpl instance = new CollectionsAlgImpl();
        
        String[] strArr = {"csdd","bsd","asd"};
        List<String> strCol = new ArrayList<>(Arrays.asList(strArr));
        int result = instance.binarySearch(strCol,"bsd");
        
        assertEquals(1, result);
    }

    /**
     * Test of indexOfSubList method, of class CollectionsAlgImpl.
     */
    @Test
    public void testIndexOfSubList() {
        System.out.println("indexOfSubList");
        CollectionsAlgImpl instance = new CollectionsAlgImpl();
        int expResult = 2;
        
        String[] strArr = {"one","two","three", "four", "five", "six"};
        List<String> strCol = new ArrayList<>(Arrays.asList(strArr));
        
        String[] strArr2 = {"three","four","five"};
        List<String> strCol2 = new ArrayList<>(Arrays.asList(strArr2));
        
        int result = instance.indexOfSubList(strCol,strCol2);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of lastIndexOfSubList method, of class CollectionsAlgImpl.
     */
    @Test
    public void testLastIndexOfSubList() {
        System.out.println("lastIndexOfSubList");
        CollectionsAlgImpl instance = new CollectionsAlgImpl();
        int expResult = 6;
        
        String[] strArr = {"one","two","three", "four", "five", "six","three", "four", "five"};
        List<String> strCol = new ArrayList<>(Arrays.asList(strArr));
        
        String[] strArr2 = {"three","four","five"};
        List<String> strCol2 = new ArrayList<>(Arrays.asList(strArr2));
        
        int result = instance.lastIndexOfSubList(strCol,strCol2);
        
        assertEquals(expResult, result);
    }
    
}
