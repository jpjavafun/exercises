package com.jpaisley.beanscope;

/**
 * Created by jpaisley on 09/11/15.
 */

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}