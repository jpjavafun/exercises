/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joep.checkoutsystem.promotions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpaisley
 */
public class PromotionalRules {
    
    List<ItemRule> itemRules;
    List<PriceRule> priceRules;
    
    
    public PromotionalRules(){
        
        itemRules = new ArrayList<>();
        priceRules = new ArrayList<>();
        
    }
    
    public void createCumulativeRule(String code, int count, long normPrice, long discPrice){
        
        if(discPrice>normPrice|| count<=0|| code==null){
            
             throw new IllegalArgumentException("Rule parameters are not valid");
        }
        
        CumulativeRule rule = new CumulativeRule(code, count, normPrice, discPrice);

        itemRules.add(rule);
        
    }
    
    public void createTotalSpendRule(long targetTotal, BigDecimal perc){
        
        if(perc.intValue() >100 || perc.intValue()<0){
            
             throw new IllegalArgumentException("Rule parameters are not valid");
        }
        
        TotalSpendRule rule = new TotalSpendRule(targetTotal, perc);
        
        priceRules.add(rule);
        
    }
    
    public List<ItemRule> getItemRules(){
        
        return this.itemRules;
    }
    
    
    public List<PriceRule> getPriceRules(){
        
        return this.priceRules;
    }
    
    
}
