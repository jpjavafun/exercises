/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.tdd.webservice.controller;

/**
 *
 * @author jpaisley
 */

import com.packtpub.tdd.webservice.data.Money;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MoneyController {
    
    
    @RequestMapping(value = "/money/{userId}", method = RequestMethod.GET, 
            produces={"application/xml", "application/json"})
    public Money getUserMoney(@PathVariable String userId){
        
        return new Money(100, "JOE");
    }
    
    
    @RequestMapping(value = "/money/{userId}", method = RequestMethod.POST, 
            produces={"application/xml", "application/json"})
    public Money addUserMoney(@PathVariable String userId){
        
        return new Money(100, "JOE");
    }
    
    @RequestMapping(value = "/money/{userId}", method = RequestMethod.PUT, 
            produces={"application/xml", "application/json"})
    public Money updateUserMoney(@PathVariable String userId){
        
        return new Money(100, "JOE");
    }
    
    @RequestMapping(value = "/money/{userId}", method = RequestMethod.DELETE, 
            produces={"application/xml", "application/json"})
    public Money removeUserMoney(@PathVariable String userId){
        
        return new Money(100, "JOE");
    }

}
