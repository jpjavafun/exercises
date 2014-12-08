/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jp.bestjava.generics;

import java.util.*;

/**
 *
 * @author jpaisley
 */
public class GenericsImpl {
    
    
    public static <T> T getNum(T num){
        
        
        return num;
    }
    
    public static <T extends Integer> int getCount(Collection<T> c){
        
        int count = 0;
        
       for(T i : c) {
        
            if ((i % 2) != 0){
                count++;
            }
        }
        
        return count;
    }
    
    
        
}
