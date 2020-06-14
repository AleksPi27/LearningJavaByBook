package com.company.redefiningmethods;

public class B extends  A {
    public int k;
    public B(int a,int b, int c){
        super(a,b);
        this.k=c;

    }


    public void show(String msg){
//        super.show();
        System.out.println(msg+k);
    }
}

