package com.company.firstPackage;

public class SameClass {
    SameClass(){
        System.out.println("The constructor of the class of the same package");
        BaseClass baseClass= new BaseClass();
       // System.out.println("First is "+baseClass.first);
        System.out.println("Second is "+baseClass.second);
        System.out.println("Third is "+baseClass.third);
        System.out.println("Fourth is "+baseClass.fourth);
    }
}
