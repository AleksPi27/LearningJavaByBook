package com.example.passingArgumentsToTheMethod;

public class ArgumentsByValueAndByReference {

    double first,second;

    ArgumentsByValueAndByReference()
    {}

    ArgumentsByValueAndByReference(double first,double second)
    {
        this.first=first;
        this.second=second;
    }
    void testByValue(double a,double b)
    {
        a*=2;
        b/=10;
    }

    void testByRefeference(ArgumentsByValueAndByReference o)
    {
        o.first*=2;
        o.second/=10;
    }
}
