package com.company.secondPackage;

import com.company.firstPackage.BaseClass;

public class OtherClass {
    OtherClass() {
        System.out.println("The constructor of other class in other package");
        BaseClass baseClass = new BaseClass();
//        System.out.println("First is " + baseClass.first);
//        System.out.println("Second is " + baseClass.second);
//        System.out.println("Third is " + baseClass.third);
        System.out.println("Fourth is " + baseClass.fourth);
    }
}
