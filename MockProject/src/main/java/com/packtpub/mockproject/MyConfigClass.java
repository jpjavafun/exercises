/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.mockproject;

/**
 *
 * @author jpaisley
 */
import org.springframework.context.annotation.*;

@Configuration
public class MyConfigClass {
    
    
    @Bean
    public ClassA getClassA(){
        
        return new ClassA();
        
    }
    
}
