package com.jpaisley.javabeanconfig;

/**
 * Created by jpaisley on 10/11/15.
 */
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}