package com.example.returningObjects;

public class ReturningObjects {
    int a;

    public ReturningObjects(int a)
    {
        this.a=a;
    }

    public ReturningObjects incrByTen()
    {
        return new ReturningObjects(a+10);
    }
}
