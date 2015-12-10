/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.spring.ws.javaconfig.dao;

/**
 *
 * @author jpaisley
 */

 
import com.packtpub.spring.ws.javaconfig.model.Book;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
     
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
    
    
    
    public Book getBookById(int id) {
        Session session = this.sessionFactory.getCurrentSession();      
        Book p = (Book) session.load(Book.class, new Integer(id));
        return p;
    }
}
