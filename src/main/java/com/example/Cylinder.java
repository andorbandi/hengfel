package com.example;

import java.util.InputMismatchException;

public class Cylinder {
    
    public static double calcSurface(double height, double radius) {

        if(radius <= 0) {
            throw new InputMismatchException("Hiba! A rádiusznak 0-nál nagyobbnak kell lennie!");
        }
        if(height <= 0) {
            throw new InputMismatchException("Hiba! A magasságnak 0-nál nagyobbnak kell lennie!");
        }
        return (2*Math.PI*Math.pow(radius,2)) + (2*Math.PI*radius*height);

    }



}
