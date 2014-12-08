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
public class SyncBuffer {
    
    private int message;
    private boolean empty;
    private int count = 0;
    
    
    
    public synchronized void  put(int item)throws InterruptedException{
        
        
        while(!empty){
           try {
                wait();
            } catch (InterruptedException e) {}
        }
          message = item;
          empty = false;
          notifyAll();
    }
   
        
        
    
    
    public synchronized int get()throws InterruptedException{
        
        
        while(empty){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
       
        
        empty=true;
        notifyAll();
        return message;
        
        
    }
    
    
    
    
    public static void main(String[] args){
        
        SyncBuffer sb = new SyncBuffer();
        SyncCon sc = new SyncCon();
        SyncProd sP = new SyncProd();
        
        sc.setLB(sb);
        sP.setLB(sb);
        
        Thread t1 = new Thread(sc);
        Thread t2 = new Thread(sP);
        
        t1.start();
        t2.start();
      
        System.out.println("Finished");
        
    }
    
    
}
