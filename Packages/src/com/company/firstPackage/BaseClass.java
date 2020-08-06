package com.company.firstPackage;

public class BaseClass {
    private Integer first = 1;
    Integer second = 2;
    protected Integer third = 3;
    public Integer fourth = 4;

    public BaseClass() {
        System.out.println("The constructor of the base class");
        System.out.println("first is " + first);
        System.out.println("second is " + second);
        System.out.println("Third is " + third);
        System.out.println("Fourth is " + fourth);
    }
}
