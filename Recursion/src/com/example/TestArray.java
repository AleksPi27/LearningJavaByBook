package com.example;

public class TestArray {

   public void test()
    {
        Array array=new Array(9);

        for (int i=0;i<8;i++)
        {
            array.values[i]=i;
        }

        array.printArray(9);
    }
}
