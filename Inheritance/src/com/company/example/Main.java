package com.company.example;

import com.company.figure.Figure;
import com.company.figure.Rectangle;
import com.company.figure.Triangle;
import com.company.redefiningmethods.B;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объём mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);


        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        vol = shipment1.volume();

        System.out.println("Объем shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
        B b = new B(1, 2, 3);
        b.show();
        b.show("Это k:");
//        A a=new A(1,2);
//        a.show();
//        System.out.println("Это k:"+b.k);

        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure f;
        f = r;
        System.out.println("Площадь равна: " + f.area());
        f = t;
        System.out.println("Площадь равна: " + f.area());
    }
}
