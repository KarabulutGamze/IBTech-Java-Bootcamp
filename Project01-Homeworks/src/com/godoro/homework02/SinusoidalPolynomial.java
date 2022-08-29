package com.godoro.homework02;


public class SinusoidalPolynomial implements MathFunction {
    
    private double m;
    private double w;
    private double p;

    @Override
    public double evaluate(double x) {
       
        return m*Math.sin(w*x-p);
       
}
    
}
