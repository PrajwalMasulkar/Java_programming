class Outer1
{
    private int a=10;
    int b =20;
    float c;
    Outer1()
    {
        System.out.println("Outer class");

    }
    void f2()
    {
        System.out.println("Method Execution");

    }
    static{System.out.println("Outer class static block execution");}
    class Inner
    {
        int m;
        boolean d;
        int p=50;
        void f1()
        {
            System.out.println("Inner class ");
            System.out.println(a);
            System.out.println(p);
            System.out.println(b);
        }
    }
    public static void main(String[] args)
    {
        Outer1 out = new Outer1();
        Outer1.Inner ol = out.new Inner();
        ol.f1();
        out.f2();
        System.out.println(out.c);
        System.out.println(ol.m);
        System.out.println(ol.d);

    }
}
