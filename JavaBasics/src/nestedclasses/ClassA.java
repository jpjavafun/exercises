/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nestedclasses;

/**
 *
 * @author jpaisley
 */
public class ClassA {
    
     int memberA = 10;
    
    public static class ClassB{
        
        public static void printStaticClassName(){
            System.out.println("static name: ClassB");
        }
        
        public void printClassName(){
            
            System.out.println("instance name: ClassB");
            
        }
        
    
    }
    
    public class ClassC{
        
        public void printName(){
            System.out.println("Class C"+this.getClass());
            System.out.println(ClassA.this.memberA);
        }
        
        
    }
    
    
}
