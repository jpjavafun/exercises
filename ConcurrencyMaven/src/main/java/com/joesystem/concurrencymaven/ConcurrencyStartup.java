/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joesystem.concurrencymaven;

import prodcons.*;
import com.joesystem.concurrencymaven.blocking.*;
/**
 *
 * @author jpaisley
 */
public class ConcurrencyStartup {
    
    
    SynchronizedCounter s1 = new SynchronizedCounter();
    
    
    public static void main(String[] args){
        
       /*
         Runnable myrun = new ThreadBasic(); 
         Thread t = new Thread(myrun);
         t.start();
         t.interrupt();
         System.out.println("Interrupted:"+t.isInterrupted());
   
         StartTest t2 = new ConcurrencyStartup().new StartTest();
         t2.startTesting();
       */
        // Drop drop = new Drop();
        //(new Thread(new Producer(drop))).start();
        //(new Thread(new Consumer(drop))).start();
        
        BlockingQueueExample bl = new BlockingQueueExample();
        
         
    }
    
     class StartTest {
    
        public void startTesting() {
            System.out.println("Start Thread  1");
           new Thread(new Runnable() {
                @Override
                public void run(){
                   for (int i=0; i<20;i++){
                       s1.increment();
                   }
                }
                }).start();
         //System.out.println("value:"+ s1.value());
           
            System.out.println("Start Thread 2");
           new Thread(new Runnable() {
                @Override
                public void run(){
                    for (int i=0; i<20;i++){
                       s1.decrement();
                   }
                }
                }).start();
        }
        
       
       
     }
    
    
}
