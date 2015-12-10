/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author jpaisley
 */
public class MyStaticClass {

    
    
    public static void main(String[] args){
        
        
        System.out.println("Hello");
        
        MyStaticClass ms = new MyStaticClass();
        
        
        MyStaticClass.MySquare myShp = ms.new MySpecialSquare();
        myShp.getTotalSides();
        
        MyStaticClass.MySpecialSquare mySquare = (
                MyStaticClass.MySpecialSquare) myShp;
        
        
        mySquare.getAngles();
                
        int[] jArr = new int[10];
        int[] jArr2 = {1,2,3,4,5,6,7,8,9,10};
        int[][] jArr3 = new int[10][10];
        int[][] jArr4 = {{1,2},{3,4},{5,6},{7,8},{9,10}};
        
        for(int i:jArr2){
            
            System.out.println(i);
        }
        
        for(int i=0;i<jArr.length-1;i++){
            System.out.println(i);
        }
        
        
        
        
        
        
        
    }
    
    
    
    interface MySquare{
        
        int getCorners();
        
        public static int getTotalAngles(){
            
            return 78;
        }
        
        default int getTotalSides(){
            
            return 99;
        }
               
        
    }
    
    
    abstract class  MyShape implements MySquare {
        
        @Override
        public int getCorners(){
            
            return 4;
        }
        
        protected abstract int getAngles();
        
    }
    
    
    class MySpecialSquare extends MyShape{
        
        int myValue;
        
           
        
        @Override
        public int getCorners(){
            
            return 5;
        }
        
        @Override
        public int getAngles(){
            return 22;
        }
        
        @Override
        public boolean equals(Object obj){
            
            if(this != obj) return false;
            if(!(obj instanceof MySpecialSquare))return false;
            
            MySpecialSquare ms = (MySpecialSquare) obj;
            
            return (this.myValue == ms.myValue);
            
                   
        }
        
        @Override 
        public int hashCode(){
            
            int result = 31;
            
            return result*this.myValue;
            
        }
        
        
        public <T, C> T myGenericMethod(T t, C c){
            
            return t;
            //return t + (Integer);
        }
        
        
    }
    
    enum DOTW {MON, TUES, WED};
    
    static class MySingletonClass{
        
     public final static MyStaticClass.MySingletonClass INSTANCE = new MyStaticClass.MySingletonClass();
       private MySingletonClass() {
         // Exists only to defeat instantiation.
        }
        
    }
    
    
}

