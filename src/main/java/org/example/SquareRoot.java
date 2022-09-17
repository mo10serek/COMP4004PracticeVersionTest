package org.example;

import java.text.DecimalFormat;

public class SquareRoot {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public double caculateRoot(double input) {
        double output = Math.sqrt(input);
        return (double) Math.round(output * 100) / 100;
    }
}
