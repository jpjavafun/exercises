/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.spring.ws.javaconfig.controller;

import com.packtpub.spring.ws.javaconfig.model.Book;
import com.packtpub.spring.ws.javaconfig.model.Message;
import com.packtpub.spring.ws.javaconfig.service.MySimpleService;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jpaisley
 */

@RestController
public class MyAPIController {
    
    
    @Autowired
    private MySimpleService simpleService;
    
    
    
    
    @RequestMapping(value="/jsonapi/{id}", produces="application/json", method=RequestMethod.GET)
    public Message getAPIMessage(@PathVariable("id") String id){
        
        System.out.println("MySimpleService");
        return simpleService.getMyMessage();
    }
    
    @RequestMapping(value="jsonapi/add/{id}", produces="application/json", method=RequestMethod.POST)
    public String addAPIMessage(@PathVariable("id") String id){
        
        return "done";
    }
    
     @RequestMapping(value="/book/{id}", produces="application/json", method=RequestMethod.GET)
    public Book getAPIBook(@PathVariable("id") String id){
       
        System.out.println("MySimpleService");
        return simpleService.getMyBook(1);
    }
    
    
}
