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
public class CircleCreator {
    
    public CircleCreator(){
        
                
    }
    
    public class Circle {
        private int x;
        private int y;
        public Circle(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        public int getX(){
            return this.x;
        }
        
        public int getY(){
            return this.y;
        }
        
        public void setX(int x){
            this.x =x;
        }
        
        public void setY(int y){
            this.y =y;
        }
         
    }
    
  public void moveCircle(Circle circle, int deltaX, int deltaY) {
    // code to move origin of circle to x+deltaX, y+deltaY
    circle.setX(circle.getX() + deltaX);
    circle.setY(circle.getY() + deltaY);
    System.out.println("inside moveCircle x"+circle.getX());
    System.out.println("inside moveCircle y"+circle.getY());  
    // code to assign a new reference to circle
    circle = new Circle(0, 0);
    System.out.println("inside moveCircle x after"+circle.getX());
    System.out.println("inside moveCircle y after"+circle.getY());  
}
    
    
}
