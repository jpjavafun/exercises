/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joesystem.fastreserve;

/**
 *
 * @author jpaisley
 */


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class RestAndServiceController {
 
 @RequestMapping(value = "/{name}", method = RequestMethod.GET)
 public String getGreeting(@PathVariable String name) {
    String result="Hello "+name;
    
    return result;
 }
  
}
