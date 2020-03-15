package com.example.staticModificator;

public class StaticModificator {

    static int a=10;
    static int b;
    static void meth(int x)
    {
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        System.out.println("b = " + b);
    }

    static
    {
        System.out.println("The static block is initialized");
        b=a*4;
    }
}
