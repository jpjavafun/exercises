package com.jpaisley.annotation.resource;

/**
 * Created by jpaisley on 11/11/15.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    public static void main(String[] args) {



        //ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ClassCConfig.class);


       //context.register(ClassCConfig.class);

        //context.refresh();

        ClassCConfig.ClassC cC = (ClassCConfig.ClassC) ctx.getBean("classC");

        cC.doStuff();

        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        ClassA cA = (ClassA) context.getBean("classA");
        cA.cC.doStuff();




    }
}