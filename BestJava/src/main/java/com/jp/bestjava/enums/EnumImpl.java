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
public class EnumImpl {
    
    enum myName {JOE, PETER};
    
    public enum Man {
    
        JOE(34), PETER(30);
        
        private int age;
    
        Man(int age){
        this.age = age;
        }
    
        public int getAge(){
            return age;
        }
    
    }
 
}
