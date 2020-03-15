class OverloadOfMethods {

    void test()
    {
        System.out.println("Without parameters");
    }

    void test(int a)
    {
        System.out.println("With one integer parameter - "+a);
    }

    void test(int a, int b)
    {
        System.out.println("With two integer parameters - "+a+ " and - "+b);
    }

    double test(double a)
    {
        System.out.println("With one double parameter - "+a);
        return a*a;
    }
}
