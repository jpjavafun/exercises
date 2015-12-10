/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jpaisley
 */
public class LambdaStarter {
    
    
    public static void main(String[] args){
      
      LambdaStarter tester = new LambdaStarter();
      
      
      new Thread(new Runnable(){
          
          
          
          @Override
          public void run(){
              System.out.println("Hello");
          }
          
        }).start();
      
      
      new Thread(()-> System.out.println("Hello")).start();
      
        //Old way:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for(Integer n: list) {
         //   System.out.println(n);
        }

        //New way:
        //list.forEach(n -> System.out.println(n));


        //or we can use :: double colon operator in Java 8
        //list.forEach(System.out::println);
        
        list.stream().filter(t -> (t> 6)).forEach(s -> System.out.println(s));
        
        
      
    }
   
    
}
