/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabasics.classesandobjects;

/**
 *
 * @author jpaisley
 */
public class Rectangle {
    
    private int width;
    private int height;

    public Rectangle(){
        
    }
    
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public int area(){
        
        return this.width * this.height;
    }
    
 
    
    
    
}
