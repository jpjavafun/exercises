/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.spring.ws.javaconfig.controller;

import com.packtpub.spring.ws.javaconfig.model.Message;
import com.packtpub.spring.ws.javaconfig.service.MySimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author jpaisley
 */
@Controller
@SessionAttributes("id")
public class MySimpleController {
    
    
    @RequestMapping(value ="/message/{id}", method=RequestMethod.POST)
    public String messageRequest(@PathVariable("id") String id, Model model){
        model.addAttribute("id", id);
        if(id.equals("2")){
            
            throw new MySimpleException();
            
        }
        
        return "success";
    }
    
    @RequestMapping(value ="/message/", method=RequestMethod.GET)
    @ResponseBody
    public String messageRequest( @ModelAttribute("id") String id){
        
        return "id"+id;
    }
    
    
    @ModelAttribute("message")
    public Message getMessage(){
        Message mess = new Message();
        mess.setText("JOE");
        return mess;     
    }
    
    
    
     @ResponseStatus(value=HttpStatus.NETWORK_AUTHENTICATION_REQUIRED, reason="Incorrect Parameter")  // 409
     @ExceptionHandler(MySimpleException.class)
     public void conflict() {
    
         System.out.println("Do nothing");
         
         
     }

}
