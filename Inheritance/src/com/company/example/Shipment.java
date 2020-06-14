package com.company.example;

public class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment ob){
        super(ob);
        this.cost=ob.cost;
    }

    Shipment(double w, double h, double d, double m,double c) {
        super(w, h, d, m);
        this.cost=c;
    }

    Shipment(){
        super();
        this.cost=-1;
    }

    Shipment(double len, double m, double c){
        super(len,m);
        this.cost=c;
    }
}
