/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.spring.ws.javaconfig.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Proxy;
 
/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author pankaj
 *
 */
@Entity
@Proxy(lazy = false)
@Table(name="Books")
public class Book implements Serializable {
    
    @Id
    @Column(name="BookID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int bookID;
    
    private String name;
    
    
     public int getId() {
        return bookID;
    }
 
    public void setId(int id) {
        this.bookID = id;
    }
    
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}
