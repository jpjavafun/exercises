package com.jpaisley.annotation.resource;

import org.springframework.context.annotation.*;

/**
 * Created by jpaisley on 11/11/15.
 */

@Configuration
public class ClassCConfig {


    class ClassC{
        ClassC(){
            System.out.println("ClassC constructor");
        }

        public void doStuff(){

            System.out.println("ClassC doStuff");
        }

    }

    @Bean
    ClassC classC(){

        return new ClassC();
    }

}
