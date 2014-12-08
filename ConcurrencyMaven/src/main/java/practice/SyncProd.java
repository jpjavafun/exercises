/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author jpaisley
 */
public class SyncProd implements Runnable{
    
  private SyncBuffer sb; 
    
   
   public void setLB(SyncBuffer sb){
       
      this.sb = sb; 
   }
   
    
    
    @Override
    public void run(){
        /*
        try{
            for(int i= 0; i <=100; i++){
                  System.out.println("Pausing");
                    Thread.sleep(4000);
                sb.put(i);
                  
                System.out.format("Put Value %d %n", i);
                   
            }
        }catch(InterruptedException e){
            
            System.out.println("Producer Interrupted ");
        }
        
        */
    }
    
    
    
}
