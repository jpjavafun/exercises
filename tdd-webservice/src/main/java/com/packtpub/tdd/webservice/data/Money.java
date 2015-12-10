/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.tdd.webservice.data;

/**
 *
 * @author jpaisley
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 


@XmlRootElement(name = "Money")
public class Money {

    
    private int money;
    
   
    private String name;
    
    public Money(){}
    
    
    public Money(int money, String name){
        
        this.money = money;
        this.name = name;
    }
    
    @XmlElement
    public int getMoney(){
        
        return this.money;
    }
    
    @XmlElement
    public String getName(){
        
        
        return this.name;
    }
    
    
    
}
