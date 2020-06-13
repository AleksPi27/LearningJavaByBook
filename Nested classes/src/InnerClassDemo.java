public class InnerClassDemo {

    public static void main(String[] args) {
	// write your code here
        Outer o=new Outer();
        o.test();
//        Boeing737.Drawing drawing1 = new Boeing737.Drawing();
//        Boeing737.Drawing drawing2 = new Boeing737.Drawing();\
        Boeing737 model1=new Boeing737(1999);
        Boeing737.Drawing drawing1= new Boeing737.Drawing();
        Boeing737.ExtendDrawing extendDrawing= model1.new ExtendDrawing();
        Boeing737.Drawing.getMaxPassengersCount();
        System.out.println(drawing1.getMaxPassengersCount());
        Boeing737.Drawing drawing3=new Boeing737.Drawing();
       System.out.println(drawing3.getClass());
       SubClassForDrawingClass subClassForDrawingClass=new SubClassForDrawingClass();
       System.out.println(subClassForDrawingClass.getManufactureYear());

       Bicycle bicycle = new Bicycle("первая",20);
       bicycle.start();
       Bicycle.SteeringWheel steeringWheel=bicycle.new SteeringWheel();
       steeringWheel.left();
       steeringWheel.right();
       Boeing737.ExtendDrawing.InnerExtendDrawing innerExtendDrawing= extendDrawing.new InnerExtendDrawing(8);
       System.out.println(innerExtendDrawing.number);
       innerExtendDrawing.getNumber();
    }
}
