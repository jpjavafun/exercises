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
public interface ItemRule {
    
    long calculateDeduction(List<Item> items);
    
}
