package com.jpaisley.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.aop.framework.ProxyFactory;
/**
 * Created by jpaisley on 09/11/15.
 */

public class MainApp {
public static void main(String[] args) {
        MessageWriter target = new MessageWriter();

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new MessageDecorator());
        pf.setTarget(target);

        MessageWriter proxy = (MessageWriter) pf.getProxy();

        target.writeMessage();
        System.out.println("");
        proxy.writeMessage();

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        Student student = (Student) context.getBean("aspectStudent");

        student.getName();
        student.getAge();

        student.printThrowException();

        }
}