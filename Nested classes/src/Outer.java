public class Outer {
    int outer_x=100;
    static int b;

    static
    {
        b=107;
    }
    void test()
    {
        Inner inner=new Inner();
        inner.display();
    }

    class Inner
    {
        int x=100;
        void display()
        {
            System.out.println("вывод: outer_x = "+outer_x);
            System.out.println("вывод: b = "+b);
        }
    }
}
