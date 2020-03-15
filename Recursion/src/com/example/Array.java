package com.example;

public class Array {
    int values[];

    Array(int i)
    {
        values=new int[i];
    }

    void printArray(int i)
    {
        if (i==0) return;
        else printArray(i-1);
        System.out.println("["+ (i-1)+"]:  "+values[i-1]);
    }
}
