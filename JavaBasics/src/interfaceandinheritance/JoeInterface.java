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
public interface JoeInterface {
    
    String WIFE = "RUTH";
    
    void scratchBottom();
    static void sayHello(String s){
      System.out.println(s);
    }
    
    default void kissRuth(){
        System.out.println("kiss");
    }
    
    
       
}
