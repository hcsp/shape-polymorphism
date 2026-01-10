package com.github.hcsp.polymorphism;

public class Rectangle extends Shape{
    public double a;
    public double b;

    public Rectangle(double a,double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }



}
