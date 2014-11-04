/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jp.bestjava.collectionstudy;


import java.util.*;
/**
 *
 * @author jpaisley
 */
public class CollectionsAlgImpl {
    
    
    public Collection sort(List c){
        
        Collections.sort(c);
        
        return c;
        
    }
    
    public Collection shuffle(List c){
        
        Collections.shuffle(c);
        
        return c;
        
    }
    
    public Collection reverse(List c){
        
        Collections.reverse(c);
        
        return c;
    }
    
    
    public Collection rotate(List c, int dist){
        
        Collections.rotate(c, dist);
        
        return c;
        
    }
    
    
    
    public Collection swap(List c, int i, int j){
        
        Collections.swap(c,i,j);
        
        return c;
        
    }
    
    
    public Collection replaceAll(List c, Object oldval, Object newVal){
        
        
        Collections.replaceAll(c, oldval, newVal);
        
        return c;
    }
    
    public Collection fill(List c, Object item){
        
        Collections.fill(c, item);
        
        return c;
        
    }
    
    
    public Collection copy(List one, List two){
        
        Collections.copy(one, two);
        
        return two;
        
    }
    
    
    public <T> int binarySearch(List c, T key){
        
        return Collections.binarySearch(c, key);
        
    }
    
    
    public int indexOfSubList(List c, List d){
      
        return Collections.indexOfSubList(c, d);
         
    }
    
    
    public int lastIndexOfSubList(List c, List d){
        
        return Collections.lastIndexOfSubList(c,d);
        
    }
   
}
