/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.amazontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jpaisley
 */
public class StringPractice {
    
    
    public static void main(String [] args){
        
        String a = "one two three";
        String b = "four two five";
        
        StringPractice sp = new StringPractice();
        
        sp.compareTwoBooks(a,b);
        
    }
    
    
    private void compareTwoBooks(String a, String b){
        
        
        String[] myA = a.split(" ");
        String[] myB = b.split(" ");
        
        ArrayList<String> myArr1 = new ArrayList(Arrays.asList(myA));
        ArrayList<String> myArr2 = new ArrayList(Arrays.asList(myB));
        
        myArr1.retainAll(myArr2);
        
        System.out.println("Finished");
        
        
    }
    
    
}
