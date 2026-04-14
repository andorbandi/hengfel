package com.example;

import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCylinder {
    
    @Test public void testCalcSurface_35_30_12252() {
        double expected = 12252.21;
        double actual = Cylinder.calcSurface(35, 30);
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test public void testCalcSurface_48_132_149288() {
        double expected = 149288.48;
        double actual = Cylinder.calcSurface(48, 132);
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test public void testCalcSurface_35_1_226() {
        double expected = 226.19;
        double actual = Cylinder.calcSurface(35, 1);
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcSurface_27_0_error() {
        Cylinder.calcSurface(27, 0);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcSurface_0_30_error() {
        Cylinder.calcSurface(0, 30);
    }

    
}
