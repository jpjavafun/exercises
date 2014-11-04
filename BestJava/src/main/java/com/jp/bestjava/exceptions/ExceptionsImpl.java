/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jp.bestjava.exceptions;


import java.io.*;
/**
 *
 * @author jpaisley
 */
public class ExceptionsImpl {
    
    public ExceptionsImpl(){
        
        test1();
        
    }
    
    
    
    private void test1(){
        
       BasicTest bt = new BasicTest();
       
       bt.testExceptionHandling(true);
        
        bt.testExceptionHandling(false);
        
        
        try {
        bt.testExceptionHandling2(true);
        } catch(IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());  
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Caught IndexOutOfBoundsException: " + e.getMessage());  
        }
    }
    
    
    
    
    
}
