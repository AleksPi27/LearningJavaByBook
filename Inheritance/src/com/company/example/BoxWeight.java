package com.company.example;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        this.weight = m;
    }

    BoxWeight(BoxWeight ob) {
        super(ob);
        this.weight = ob.weight;
    }

    BoxWeight() {
        super();
        this.weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }

}

