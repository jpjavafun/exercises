/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.whiteboard;

/**
 *
 * @author jpaisley
 */
public class GetStarted {
    
    
    
    public static void main(String[] args){
        
        System.out.println("Getting Started");
        
        GetStarted gs = new GetStarted();
        
        GetStarted.Animal a = gs.new Dog();
        
        System.out.println(a.getClass());
        a.run();
        
        long t = 9223372036854775807l;  
        int j = (int) t>>32;
        System.out.println("j"+j);
        
        switch(j){
            
        }
        
        short s = 1010101010101010101;
        
        
    }
    
    class Animal {
    
    public void run(){
        System.out.println("Animal");
    }

    }

    class Dog extends Animal  {
        
    @Override
    public void run(){
        System.out.println("Dog");
    }
    }
    
    
}
