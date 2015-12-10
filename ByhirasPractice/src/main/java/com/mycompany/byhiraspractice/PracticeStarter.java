/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.byhiraspractice;

/**
 *
 * @author jpaisley
 */




public class PracticeStarter {
    
    
    private Calculator calculator;
    
    
    
    PracticeStarter(){
        
        
        
    }
    
    
    public static void main(String[] args){
        
        Calculator c = new Calculator();
        PracticeStarter sp = new PracticeStarter();
        sp.setCalculator(c);
        
        int[] arr = new int[6];
        int[] arr1 = {1,2,3,4,5,};
        int[][] arr2 = new int[6][6];
        int[][] arr3 = {{1,2,3},{4,5,6,7}};
        
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++)
                System.out.println(arr3[i][j]);
        }
        
        
        Node n = new Node();
        
        int j = n.data;
        
        
        
        
    }
    
    
    public void calculateAndOutputNumbers(int i, int j){
        
        int result = calculator.addNumbers(i, j);
        System.out.println(result);
        
        
    }
    
    public void setCalculator(Calculator c){
        this.calculator = c;
    }
    
    
    
    
    
    
    
    
    
}
