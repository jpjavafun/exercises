/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joep.checkoutsystem.promotions;

import com.joep.checkoutsystem.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author jpaisley
 */
public class CumulativeRule implements ItemRule {
    
    String prodCode;
    long normalPrice;
    int count;
    long reducedPrice;
    
    
    CumulativeRule(String prodCode, int count, long normalPrice, long reducedPrice){
        this.prodCode=prodCode;
        this.normalPrice = normalPrice;
        this.count = count;
        this.reducedPrice = reducedPrice;
        
    }
    
    
    public long calculateDeduction(List<Item> items){
        
        int prodCount = 0;
        long totalDeduction = 0l;
        
            for(Item item : items){
                if(item.getProdCode().equals(this.prodCode)){
                    prodCount++;
                }
            }

            if(prodCount>=count){
                
                totalDeduction += (normalPrice-reducedPrice)*prodCount;

            }
        
        return totalDeduction;
 
    }
    
}
