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
public class ThreadBasic implements Runnable{
    
    
    public void run() {

        
        try {
            Thread.sleep(15000);
             System.out.println("Joe is the best!");
        } catch (InterruptedException e) {
             System.out.println("Interrupted");
            return;
        }
           
    }
}
