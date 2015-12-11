package com.jpaisley.postprocessor;

/**
 * Created by jpaisley on 09/11/15.
 */
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld2");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
