package com.company;

public class Main {

    public void functionWithVaragrs(int ... v){
        for (int x:v) {
            System.out.println(x);
        }
    }

   public static void main(String[] args) {
	// write your code here
        String string="bla";
        System.out.println(string);
        string="f";
        System.out.println(string);
        Main main = new Main();
        main.functionWithVaragrs(1,2,3);
        main.functionWithVaragrs(1);
        main.functionWithVaragrs(1,2,3,4);

        for (int i = 0;i<args.length;i++){
            System.out.println("args["+i+"] : "+args[i]);
        }
    }
}
