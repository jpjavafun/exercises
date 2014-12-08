/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joesystem.concurrencymaven.locking;

/**
 *
 * @author jpaisley
 */
public class ThreadCreator {
    
    public void createThreads(){
        
        final LockTester lt = new LockTester();
        
        new Thread(new Runnable(){
        @Override
        public void run(){
            
           lt.outputA();
            
        }
        
        });
        
         new Thread(new Runnable(){
        @Override
        public void run(){
            
           lt.outputB();
            
        }
        
        });
         
          new Thread(new Runnable(){
        @Override
        public void run(){
            
           lt.outputB();
            
        }
        
        });
        
        
    }
    
}
