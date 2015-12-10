/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author jpaisley
 */
public class ExceptionStarter {
    
    
    
    public static void main(String[] args){
        
        try {
               
            throw new CustomException();
        } 
        catch(Exception e){
            
            e.printStackTrace();
            
        }finally{
            System.out.println("Finished");
            
        }
        
    }
    
}
