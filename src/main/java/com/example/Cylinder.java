package com.example;

public class Cylinder {
    
    public static double calcSurface(double height, double radius) {

        return (2*Math.PI*Math.pow(radius,2)) + (2*Math.PI*radius*height);

    }



}
