package com.company.example;

public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }

    Box(double w, double h, double d){
        this.width=w;
        this.height=h;
        this.depth=d;
    }

    Box(){
        this.width=-1;
        this.height=-1;
        this.depth=-1;
    }

    Box(double len){
        this.width=this.height=this.depth=len;
    }

    double volume(){
        return this.width*this.height*this.depth;
    }
}