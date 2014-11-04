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
public class IteratorStudy {
    
    private List<String> li;
    
    IteratorStudy(){
        
        li = new ArrayList<>();
        li.add("joe"); 
        
        System.out.println("Checking collection using .contains"+li.contains("joe"));
        
        useNewForLoop(li);
        useIterator(li);
        
    }
    
    
    private void useNewForLoop(List li){
          
        for (Object o: li){
            System.out.println("Using for each:"+o);
        }
    }
    
    private void useIterator(List li) {
        
        Iterator iter = li.iterator();
     
        while(iter.hasNext()){
            System.out.println("Using iterator:"+iter.next());
        }
    }
    
}
