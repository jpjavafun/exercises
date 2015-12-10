/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.spring.ws.javaconfig.model;

import org.springframework.stereotype.Repository;

/**
 *
 * @author jpaisley
 */

@Repository("MySimpleDAO")
public class MySimpleDAO {
    
    
    public Message getMessage(){
        
        Message message = new Message();
        message.setText("Hello");
        
        return message;
    }
    
    
}
