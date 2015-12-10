/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcg.knightmove;

/**
 *
 * @author jpaisley
 */

public class Key {
    
    private char name;
    
    private char[] moves;
    
    private boolean isVowel;
    
    Key(char name,char[] moves, boolean isVowel){
        
        this.name = name;
        this.moves = moves;
        this.isVowel = isVowel;
    }
    
    public char getName(){
        return this.name;
    }
    
    public char[] getMoves(){
        
        return this.moves;
    }
    
    public boolean isVowelKey(){
        return this.isVowel;
    }
    
}
