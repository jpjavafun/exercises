/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcg.knightmove;


import java.util.HashMap;

/**
 *
 * @author jpaisley
 */
public class SequenceCount {
    
    
    
    HashMap<Character,int[]> pathCount;
   
    
    
    
    SequenceCount(){

        this.pathCount = new HashMap<>();
    }
    
    
    public void incrementCount(int vowelCount, Character s){
        
        if(this.pathCount.containsKey(s)==false){  
            this.pathCount.put(s, new int[3]);
        }
        if(vowelCount==2){
            incrementTwoPaths(s);
        }else if (vowelCount==1){
            incrementOnePaths(s);
        }else if(vowelCount==0){
            incrementZeroPaths(s);
        }
        
    }
    
    public void incrementZeroPaths(Character c){
       int[] arr =  this.pathCount.get(c);
       arr[0]++;
       this.pathCount.put(c, arr);
    }
    
    public void incrementOnePaths(Character c){
        int[] arr =  this.pathCount.get(c);
       arr[1]++;
       this.pathCount.put(c, arr);
    }
    
    
     public void incrementTwoPaths(Character c){
         int[] arr =  this.pathCount.get(c);
       arr[2]++;
       this.pathCount.put(c, arr);
    }
    
    public int getZeroPaths(Character c){
        int[] arr =  this.pathCount.get(c);
        return arr[0];
    }
    
    public int getOnePaths(Character c){
        int[] arr =  this.pathCount.get(c);
        return arr[1];
    }
    
    public int getTwoPaths(Character c){
        int[] arr =  this.pathCount.get(c);
        return arr[2];
    }
    
    
    public int getTotalCounts(int vowelCount, char sEnd){
        
        int total = 0;
        
        for(Character c : pathCount.keySet()){
            
            if (c!= sEnd){       
                    if(vowelCount==2){
                        total+=getZeroPaths(c);
                    }else if (vowelCount==1){
                        total += getZeroPaths(c);
                        total+= getOnePaths(c);
                    }else if(vowelCount==0){
                         total += getZeroPaths(c);
                        total+= getOnePaths(c);
                        total+= getTwoPaths(c);
                    }
            }
            
        }
  
          
        return total;
    }
    

}
