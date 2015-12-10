/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.spring.ws.javaconfig.service;

import com.packtpub.spring.ws.javaconfig.dao.BookDAO;
import com.packtpub.spring.ws.javaconfig.model.Book;
import com.packtpub.spring.ws.javaconfig.model.Message;
import com.packtpub.spring.ws.javaconfig.model.MySimpleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jpaisley
 */
@Transactional
@Service
public class MySimpleService {
    
    
    @Autowired(required=true)
    private MySimpleDAO mySimpleDAO;
    
    @Autowired(required=true)
    private BookDAO bookDAO;
    
    
    public Message getMyMessage(){
        
        Message message = mySimpleDAO.getMessage();
        return message;
    }
 
    
    public Book getMyBook(int id){
        
        Book book = bookDAO.getBookById(id);
        return book;
    }
    
}
