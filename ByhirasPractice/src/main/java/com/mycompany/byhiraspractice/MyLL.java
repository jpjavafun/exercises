/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.byhiraspractice;

/**
 *
 * @author jpaisley
 */
public class MyLL {
    
    Node head;
    
    
    class Node{
        
        Object data;
        Node next; 
        
        Node(Object data, Node next){
            
            this.data = data;
            this.next = next;
        }
        
    }
    
    
    public Node addNode(Object data){
        
        Node n = new Node(data,head);
        this.head = n;
        return n;
        
    }
    
    public boolean removeNode(Object data){
        
        boolean result = false;
        
        if(head.data == data){
           head = head.next;    
           result = true;
        }else {
            
            Node n = head;
            while(n.next.data != data){
                
                n = n.next;
            }
            
            n.next = n.next.next;
            result = true;
            
        }
        
        return result;
        
    }
    
    
    public String outputList(){
        
        StringBuffer sb = new StringBuffer();
        
        Node n = head;
        
        while(n != null){
            
            sb.append(n.data+"-");
            n = n.next;
        }
        
        return sb.toString();
        
    }
    
    
    
}
