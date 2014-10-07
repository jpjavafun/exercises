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
public interface Animal {
    
    static String name = "ANIMAL";
    
    void run();
    
    void hop();
    
    void doPoo();
    
    default void runAbout(){
        
        System.out.println("Animal Running about");
    }
    
}
