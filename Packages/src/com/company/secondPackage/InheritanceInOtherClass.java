package com.company.secondPackage;

import com.company.firstPackage.BaseClass;

public class InheritanceInOtherClass extends BaseClass {
    InheritanceInOtherClass() {
        System.out.println("The constructor of the class-inheritor in other package");
//        System.out.println("First is " + first);
//        System.out.println("Second is " + second);
        System.out.println("Third is " + third);
        System.out.println("Fourth is " + fourth);
    }

    InheritanceInOtherClass(Integer third) {
        System.out.println("The constructor of the class-inheritor in other package with one argument");
        this.third = third;
    }
}
