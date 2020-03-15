package com.example.overloadofconstructor;

import com.example.overloadofconstructor.Box;

public class TestBox {
  public void testBox()
    {
        Box box1=new Box(10,20,30);
        Box box2=new Box();
        Box box3=new Box(15);

        double vol;
        vol=box1.volume();
        System.out.println("The volume of the first box equals - "+vol);

        vol=box2.volume();
        System.out.println("The volume of the second box equals - "+vol);

        vol=box3.volume();
        System.out.println("The volume of the third box equals - "+vol);
    }
}
