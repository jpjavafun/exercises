/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.skypractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jpaisley
 */
public class Starter {
    
    
   
    public static void main(String[] args){
        
       Starter s = new Starter();
       s.findMyFile("/space/netbeans/SkyPractice");
       s.countLines("/space/netbeans/SkyExercise/myFile.txt");
        
       Starter.MyA a = s.new MyA();
       
       a.getInt();
       
       
    }
    

    public boolean findMyFile(String fileName){
        
        File f  = new File(fileName);
        
        File[] myFiles = f.listFiles();
        
        for(File file : myFiles){
            
            if(file.isDirectory()){
                findMyFile(file.getAbsolutePath());
            }else{
                System.out.println(file);
            }
            
            
        }
        
        return true;
    
    
    }
    
    
    
    
    int countLOC(String fileName){
        
       try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String line;
        
           int r;
            while ((r = br.read()) != -1) {
                char ch = (char) r;
                System.out.println("Do something with " + ch);
            }
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
	} 
        
       return 14;
    }  
        
    int countLines(String fileName){
        
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
        
            String line;
            while((line = br.readLine())!= null){
                System.out.println(line.endsWith("\n"));
                char[] myChars = line.toCharArray();
                for(char c : myChars){
                    System.out.println("char:"+c);
                }
                

            }
            
        }catch(IOException e){
            
            e.printStackTrace();
        }
        
        return 67;
    }
        
     
    class MyA{
        
        
        int getInt(){
            
            return 33;
        }
        
        
    }
    
    
}



