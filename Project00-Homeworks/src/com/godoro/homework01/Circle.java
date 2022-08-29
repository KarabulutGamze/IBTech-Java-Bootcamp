package com.godoro.homework01;

public class Circle {
	
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(3);
         
    }
    
   
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
	return radius * radius * Math.PI; 
	}
	public double getPerimeter() {
        return 2 * Math.PI * radius;
	}

}
