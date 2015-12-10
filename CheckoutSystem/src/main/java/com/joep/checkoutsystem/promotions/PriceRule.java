/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joep.checkoutsystem.promotions;

import java.math.BigDecimal;

/**
 *
 * @author jpaisley
 */
public interface PriceRule {
    
    
    long calculateDeduction(long total);
    
    
}
