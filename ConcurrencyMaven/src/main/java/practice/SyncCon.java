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
public class SyncCon implements Runnable{
    
   
   private SyncBuffer sb; 
    
   
   public void setLB(SyncBuffer sb){
       
      this.sb = sb; 
   }
   
   
    @Override
    public void run(){
        
        try{
            for(int i= 0; i <= 100; i++){
                
                int val = sb.get();
                Thread.sleep(100);
                System.out.format("Get Value %d %n", val);
                
            }
        }catch(InterruptedException e){
                    
                System.out.println("Consumer Interrupted ");     
                    
        }
        
            
        }
}
