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
public class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
        System.out.println(Thread.currentThread().getName());
    }

    public synchronized void decrement() {
        c--;
         System.out.println(Thread.currentThread().getName());
    }

    public synchronized int value() {
        
     System.out.println(Thread.currentThread().getName());   
        return c;
    }
    
}
