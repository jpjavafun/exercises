/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;


import java.util.concurrent.locks.*;
/**
 *
 * @author jpaisley
 */
public class LockBuffer {
    
    private Lock lock = new ReentrantLock();
    private final Condition fullCon = lock.newCondition();
    private final Condition emptyCon = lock.newCondition();
    
    private int message;
    private boolean empty = true;
    
    
    public void  put(int item)throws InterruptedException{
        
        lock.lock();
        
        try{
            while(!empty){

                emptyCon.await();
            }
            message = item;
            empty = false;
            fullCon.signal();
        }finally{
            lock.unlock();
         
        }
    }
   
        
        
    
    
    public int get()throws InterruptedException{
        
        lock.lock();
       
            try {
                while(empty){
                System.out.println("fullCon await");
                fullCon.await();
                }
                empty = true;
                emptyCon.signal();
                return message;
                
            } finally{
                lock.unlock();
            }
            
           
        }
       
        
      
        
        
    
    
    
    
    
    public static void main(String[] args){
        
        LockBuffer lb = new LockBuffer();
        LockCon sc = new LockCon();
        LockProd sP = new LockProd();
        
        sc.setLB(lb);
        sP.setLB(lb);
        
        Thread t1 = new Thread(sc);
        Thread t2 = new Thread(sP);
        
        t1.start();
        t2.start();
      
        System.out.println("Finished");
        
    }
}
