/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.*;

/**
 *
 * @author jpaisley
 */
public class MyCollectionClass {
    
    public static void main(String[] args){
        
        ArrayList<Object> arr1 = new ArrayList<>();
        
        HashSet<String> arr2 = new HashSet<>();
        
        
        HashMap<String,Integer> arr3 = new HashMap<>();
        
        arr3.put("Joe", 35);
        
        
        arr1.add(new MyCollectionClass().new Person(35, "Joe"));
        arr1.add(new MyCollectionClass().new Person(32, "Ruth"));
        
        
        
        for (Object p : arr1){
            
            Person j = (Person)p;
            System.out.println((j.getAge()));
        }
        
        //arr1.stream().filter((Person)p.);
        
        
        throw new IllegalArgumentException("Error");
        
                  
    }
    
    class Person {
    
        public int age;
        public String name;
        
        Person(int age, String name){
            
            this.age = age;
            this.name = name;
        }
    
        int getAge(){
            return this.age;
        }
    
    
    }
    
    
}
