/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joep.checkoutsystem.promotions;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author jpaisley
 */
 public class TotalSpendRule implements PriceRule {
    
    long targetTotal;
    BigDecimal percentageReduction;
    
    
    TotalSpendRule(long targetTotal, BigDecimal percentageReduction){
        
        this.targetTotal = targetTotal;
        this.percentageReduction=percentageReduction;
        
    }
    
    
    public long calculateDeduction(long total){
        
        long reduction = 0l;
            
            if(total>=targetTotal){
                
                reduction = BigDecimal.valueOf(total).divide(new BigDecimal("100")).multiply(percentageReduction).longValue();
            }
        
        return reduction;
    }
    
}
