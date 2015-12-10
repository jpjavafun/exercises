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
public class SequencePart {
    
    private int length;
    private char startKey;
    private char endKey;
    private int noOfVowels;
    private char lastKey;
    
    SequencePart(int length, char start, char end, int noOfVowels, char lastKey){
        
        this.length=length;
        this.startKey=start;
        this.endKey=end;
        this.noOfVowels=noOfVowels;
        this.lastKey = lastKey;
        
        
    }
    
    public char getStartKey(){
        return this.startKey;
    }
    
    public char getEndKey(){
        return this.endKey;
    }
    
    public int getNoOfVowels(){
        return this.noOfVowels;
    }
    
    public char getLastKey(){
        return this.lastKey;
    }
    
}
