package com.example.usageOfFinal;

public class Final {

    void calculate(final int b)
    {
        final int c;
        c=10;
        //c=20;you can't do that because c is the local final variable
//        b=70;you can't do that because b is the final parameter of the method and can't be modified during an invocation
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }
}
