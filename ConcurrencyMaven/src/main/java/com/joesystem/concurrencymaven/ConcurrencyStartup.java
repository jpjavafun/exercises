/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joesystem.concurrencymaven;

/**
 *
 * @author jpaisley
 */
public class ConcurrencyStartup {
    
    
    public static void main(String[] args){
        
       
         Runnable myrun = new ThreadBasic(); 
         Thread t = new Thread(myrun);
         t.start();
         t.interrupt();
   
        
    }
    
}
