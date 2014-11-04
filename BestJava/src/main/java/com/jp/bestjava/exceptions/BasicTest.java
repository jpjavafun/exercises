/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jp.bestjava.exceptions;

import java.io.*;
import java.util.List;
import java.util.ArrayList;



/**
 *
 * @author jpaisley
 */
public class BasicTest {
    
    
    public void testExceptionHandling(boolean testSize){
        
        int size = (testSize)?11:10;
        ArrayList<Integer> list = new ArrayList<>(10);
         for (int i = 0; i < 10; i++) {
            list.add(new Integer(i));
        }
        
        try { 
        
            PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
            
            for (int i = 0; i < size; i++) {
            // The get(int) method throws IndexOutOfBoundsException, which must be caught.
            System.out.println("Value at: " + i + " = " + list.get(i));
            }
        }
        catch(IOException e){
            
          System.err.println("Caught IOException: " + e.getMessage());  
        }
        catch(IndexOutOfBoundsException e){
          System.err.println("IndexOutOfBoundsException: " + e.getMessage());  
        }
       finally {
        System.out.println("Executing Finally");
        }
        
    }
    
    
      public void testExceptionHandling2 (boolean testSize) throws IOException {
        
        int size = (testSize)?11:10;
        ArrayList<Integer> list = new ArrayList<>(10);
         for (int i = 0; i < 10; i++) {
            list.add(new Integer(i));
        }
        
       
        
            PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
            
            for (int i = 0; i < size; i++) {
            // The get(int) method throws IndexOutOfBoundsException, which must be caught.
            System.out.println("Value at: " + i + " = " + list.get(i));
            }
        
        
    }
    
    
}
