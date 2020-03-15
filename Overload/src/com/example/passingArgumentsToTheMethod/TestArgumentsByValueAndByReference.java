package com.example.passingArgumentsToTheMethod;

public class TestArgumentsByValueAndByReference {

    public void test()
    {

        ArgumentsByValueAndByReference obj=new ArgumentsByValueAndByReference();
        double a=12;
        double b=1000;
        System.out.println("a dnd b before and invocation of the method: "+a + " and "+b);
        obj.testByValue(a,b);
        System.out.println("a and b after an invocation of the method: " + a + " and " + b);
        ArgumentsByValueAndByReference obj1=new ArgumentsByValueAndByReference(12,1000);
        System.out.println("obj1 before an invocation of the method: "+obj1.first+" and "+obj1.second);
        obj1.testByRefeference(obj1);
        System.out.println("obj1 after an invocation of the method: " + obj1.first + " and " + obj1.second);

    }
}
