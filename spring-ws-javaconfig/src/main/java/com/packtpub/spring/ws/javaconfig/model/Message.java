/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.spring.ws.javaconfig.model;

/**
 *
 * @author jpaisley
 */
public class Message {
    
    
    private String text;
    
    public void setText(String text){
        this.text=text;
    }
    
    public String getText(){
        return this.text;
    }
    
}
