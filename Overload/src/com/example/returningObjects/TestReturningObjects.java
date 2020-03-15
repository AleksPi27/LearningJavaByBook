package com.example.returningObjects;

public class TestReturningObjects {

    public void test()
    {
ReturningObjects obj=new ReturningObjects(6);
ReturningObjects obj1;
obj1=obj.incrByTen();

System.out.println("obj.a: "+obj.a);
System.out.println("obj1: "+obj1.a);

obj1=obj1.incrByTen();
System.out.println("obj1.a after increasing the value: "+obj1.a);
    }

}

