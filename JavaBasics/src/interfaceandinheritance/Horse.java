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
public class Horse extends Mammal{
    
    public static String colour = "black";
    
    public Horse(){
        
        System.out.println("Horse Constructor");
    }
    
    
    @Override
    public void speak(){
        System.out.println("Horse speaking");
    }
    
    public void hop(){
        System.out.println("Horse hopping");
    }
    
    public void runAbout(){
        
         System.out.println("Horse Running about");
    }
    
    public void callDooDoo(){
        
        System.out.println("calling private doodoo" + doodoo());
        
    }
    
    
}
