package com.godoro.homework02;

public class Test {
	
public static void main(String[] args) {
        
        IdentityFunction f1=new IdentityFunction();
        QuadraticPolynomial quadratic=new QuadraticPolynomial();
        SinusoidalPolynomial sinusoidal=new SinusoidalPolynomial();
        
        System.out.println(f1.evaluate(10));
        System.out.println(quadratic.evaluate(-5));
        System.out.println(sinusoidal.evaluate(-Math.PI));
        
        FunctionDrawer drawer=new FunctionDrawer();
   
        
        drawer.draw(f1,10,15,100);        
        drawer.draw(quadratic, -5, 5, 100);
        drawer.draw(sinusoidal, -Math.PI, Math.PI, 100);
    
    
}

}
