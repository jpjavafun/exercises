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
        
    }
    
}
