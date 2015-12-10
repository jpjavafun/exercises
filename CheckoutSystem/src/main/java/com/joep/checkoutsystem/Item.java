/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joep.checkoutsystem;

import java.math.BigDecimal;

/**
 *
 * @author jpaisley
 */
public class Item {
    
    String prodCode;
    String desc;
    long price;
    
    public Item(String prodCode,String desc,long price){
        this.prodCode = prodCode;
        this.desc = desc;
        this.price = price;      
    }
    
    public String getProdCode(){
        return this.prodCode;
    }
    
    public String getDesc(){
        return this.desc;        
    }
    
    public long getPrice(){
        return this.price;
    }
    
}
