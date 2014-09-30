/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joesystem.collectionstudy;


import java.util.*;
/**
 *
 * @author jpaisley
 */
public class ListCreator {
    

    public ListCreator(){
        
        Collection c = createArrayList();
        testTraversing(c);
        
    }
    
    public Collection<?> createArrayList(){
        Collection<String> c = new ArrayList<String>();
        c.add("one");
        c.add("two");
        c.add("three");
        
        return c;
    }
    
    public Collection<?> createLinkedList(){
        Collection<String> c = new LinkedList<String>();
        c.add("one");
        c.add("two");
        c.add("three");
        
        return c;
    }
    
    public Collection<?> createLinkedListQueue(){
        Collection<String> c = new LinkedList<String>();
        c.add("one");
        c.add("two");
        c.add("three");
        
        return c;
    }
    
    
    private void testTraversing(Collection<String> c){
        
        
        //Using Iterator
        Iterator iter = c.iterator();
        while(iter.hasNext()){
            
            System.out.println(iter.next().toString());
        }
        
        //Using for each
        for(Object str : c){
            System.out.println(str.toString());
        }
        
        //Using Stream
        c.stream().forEach(e-> System.out.println(e.toString()));
        
        //Using Stream to print only 
        c.stream()
                .filter(e -> e =="two")
                .forEach(e -> System.out.println(e));
        
    }
    
}
