/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jp.bestjava.enums;

/**
 *
 * @author jpaisley
 */
public enum SingletonEnum {
    
    INSTANCE;
    
    public void doSomething(){
        System.out.println("Singleton Doing Something");
    }
}
