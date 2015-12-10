/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.amazontest;

import java.math.BigDecimal;

/**
 *
 * @author jpaisley
 */
public class Starter {
    
    
    
    public static void main(String[] args){
        
        
        Starter st = new Starter();
        st.solution(new int[]{5, 4, 4, 5, 5, 12});
        
         
       int A = 4;
       int B =17;
        
       //double startA = Math.sqrt(A);
       //double startB = Math.sqrt(B);
       /*
       //int startA = (int) Math.floor(Math.sqrt(n));
       //int startB = (int) Math.floor(Math.sqrt(n));
       
       int count=0;
       
       for(int i =startA; i<=startB;i++){
           
          int square = i*i;
           
          if(square>=A && square<=B )count++;
           
           
       }
       */
       long money = new BigDecimal("32.50").multiply(BigDecimal.valueOf(100)).longValue();
       
       BigDecimal perc = new BigDecimal("50.52");
       
       
       long calc = BigDecimal.valueOf(money).divide(BigDecimal.valueOf(100)).multiply(perc).longValue();
       
       
       System.out.println(money);
       

       
        
        
    }
    
    
     public int solution(int[] A) {
         
        int max =0;
     
        int start =0;
        //5, 4, 4, 5, 5, 12}
        
        
        
        for(int i = 2; i<A.length-1;i++){
         
        
              
            
         if(A[i]==A[start] || A[i]==A[start+1]){
           
             
             continue;
         }else{
            int newMax = (i)-start;
            if(newMax>max)max=newMax;
            start=i;
             
         }
         
         
         
        }
     
        return max;
     
    }
    
}
