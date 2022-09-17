package org.example;

import java.text.DecimalFormat;

public class SquareRoot {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public double caculateRoot(double input) {
        if (input <= 0) {
            System.out.println("value cannot be zero");
            return 0.0;
        }
        double output = Math.sqrt(input);
        if (output < 0.01) {
            return output;
        }
        return (double) Math.round(output * 100) / 100;
    }
}
