/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabasics.classesandobjects;




/**
 *
 * @author jpaisley
 */
public class EnumCreator {
    
    public enum Currency {DOLLAR, NICKEL, DIME};
    
    Currency c;
    
    
    public EnumCreator(Currency c){
        
        this.c =c;
    }
    
    
}
