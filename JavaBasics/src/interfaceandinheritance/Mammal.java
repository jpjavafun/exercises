/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceandinheritance;

/**
 *
 * @author jpaisley
 */
 public abstract class Mammal implements Animal{
     
     
     String name = "Mammal";
     
     public static String colour = "brown";
     
     public Mammal(){
         
         System.out.println("Mammal Constructor");
     }
     
     
     
     public void run(){
         System.out.println("Mammal Running");
     }
     
     public void doPoo(){
         System.out.println("Mammal doing POO");
     }
     
     public abstract void speak();
     
     
     
    
}
