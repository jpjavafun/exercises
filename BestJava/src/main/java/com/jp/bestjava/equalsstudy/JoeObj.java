/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jp.bestjava.equalsstudy;

/**
 *
 * @author jpaisley
 */
public class JoeObj {
    
    private long s;
    private long t;
    
    public JoeObj(long s, long t){
        
        this.s =s;
        this.t =t;
        
    }
    
    @Override
    public boolean equals(Object obj){
        
        if (this == obj) return true;
        
        if (obj == null) return false;
        
        if(!(obj instanceof JoeObj)) return false;
        
        JoeObj newObj = (JoeObj) obj;
        
        return ((this.s == newObj.s) && (this.t==newObj.t));
        
        
        }
        
        @Override
        public int hashCode(){
            int result = 17;
            
            result = 31 * result +  (int)(s ^ (s >>> 32));
            result = 31 * result +  (int)(t ^ (t >>> 32));
            
        return result;
        
    }
}
