package com.example.factorial;

public class Factorial {
    int fact(int n)
    {
        int result;

        if (n==1) return 1;
        result=fact(n-1)*n;
        System.out.println("Result: "+result);
        return result;
    }
}
