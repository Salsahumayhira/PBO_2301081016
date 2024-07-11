/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salsa_27042024;

/**
 *
 * @author Salsabilla Humayhira saputri
 */
public class Circle {
     private double radius;
     public Circle (double radius){
     }
    public Circle(){
    }
   public void setRadius (int radius){
    this.radius = radius;
   }
   public String getName(){
   return "Circle";
   }
    public double getArea(){
    return Math.PI *radius *radius;
    }
    
}
