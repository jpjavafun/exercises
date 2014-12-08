/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabasics;

import javabasics.classesandobjects.*;
import interfaceandinheritance.*;
import java.lang.*;
import nestedclasses.*;
import enums.*;
import cloning.*;
import javabasics.generics.*;
/**
 *
 * @author jpaisley
 */
public class JavaBasics {

    
      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Deck d = new Deck();
        System.out.println(d);
        
        
        CircleCreator cr = new CircleCreator();
        CircleCreator.Circle cObj = cr.new Circle(5,5);
        cr.moveCircle(cObj, 3, 4);
        System.out.println("circle x" + cObj.getX());
        System.out.println("circle y"+cObj.getY());
        
        
        EnumCreator ec = new EnumCreator(EnumCreator.Currency.DIME);
        */
        
        JoeInterface joe = new Husband();
        joe.kissRuth();
        JoeInterface.sayHello(JoeInterface.WIFE);
        
        
        Animal jAnim = new Horse();
        jAnim.hop();
        jAnim.run();
        jAnim.doPoo();
        jAnim.runAbout();
        System.out.println(jAnim.getClass());
        System.out.println(Horse.colour);
        System.out.println(Mammal.colour);
        Integer.valueOf("123");
        
        
        int j =4;
        
        System.out.println(--j);
        System.out.println(j);
        System.out.println(j--);
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);
        System.out.println(j);
        
        
        ClassA.ClassB cb = new ClassA.ClassB();
        cb.printClassName();
        ClassA.ClassB.printStaticClassName();
        
        ClassA ca = new ClassA();
        ClassA.ClassC cc = ca.new ClassC();
        cc.printName();
        
        
        for(EnumImpl.Man p : EnumImpl.Man.values()){
            
            System.out.println(p.getAge());
            
        }
        
      System.out.println(EnumSingleton.INSTANCE);
      
     
      
      try{
           BaseClassA a = new BaseClassA();
          BaseClassA b = (BaseClassA) a.clone();
          
          BaseClassA c = a;
        
        System.out.println("a == b :"+ (a == b));
        
        
      } catch (CloneNotSupportedException e){
          e.printStackTrace();
      }
      
      
      BaseClassB chair = new BaseClassB();
      
      System.out.println(chair.desk1);
      System.out.println(chair.desk2);
      System.out.println(chair.desk3);
      
      System.out.println(chair.triangle(6));
      
      
       System.out.println(chair.fibonacci(5));
      
       
        BoxClass <Integer> bx1 = new BoxClass<>();
        bx1.set(9);
        
        int yBox = bx1.setGeneric(9, 9);
       
        int yBox2 = bx1.setGenericAgain(9, 22);
        
        
        int largeInt = 213213221;
        byte y = (byte)largeInt;
        Byte xx = new Byte(y);
        System.out.println(xx.byteValue());
        
 
    }
    
   
    
    
    
   
}