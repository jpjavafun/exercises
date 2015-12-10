/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.mockproject;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author jpaisley
 */
public class ClassUnderTest {
    
    
    @Autowired
    private ClassA classa;
    
    RepositoryClass rep;
    
    ClassUnderTest(RepositoryClass rep){
        
        this.rep = rep;
    }
    
    
    public String doSomething(){
        
        return rep.getString()+"Joe";
        
    }
    
    public String doSomethingAgain(){
        
        return classa.getString();
    }
    
    
    
    
}
