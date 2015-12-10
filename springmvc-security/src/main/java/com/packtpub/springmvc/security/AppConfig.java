/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.springmvc.security;

/**
 *
 * @author jpaisley
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@EnableWebMvc
@Configuration
@ComponentScan({ "com.packtub.springmvc.security.*" })
@Import({ SecurityConfig.class })
public class AppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver 
                          = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
        
        @Bean
        public ApplicationListener applicationListener(){
            
            return new ApplicationListener<ContextRefreshedEvent>(){
                
                @Override
                public void onApplicationEvent(ContextRefreshedEvent event) {
                System.out.println("JOE:"+event.toString());
                }
                
                
                
                };
            
  
            
        }

	
}
