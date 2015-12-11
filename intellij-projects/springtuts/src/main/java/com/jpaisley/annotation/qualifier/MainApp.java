package com.jpaisley.annotation.qualifier;

/**
 * Created by jpaisley on 10/11/15.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");

        Profile profile = (Profile) context.getBean("profile");

        profile.printAge();
        profile.printName();
    }
}