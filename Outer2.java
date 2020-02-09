class Outer2
{
    private int a=10;
    int b=20;
    class Inner
    {
        void f1()
        {
            System.out.println("Inner class");
            System.out.println(a);
            System.out.println(b);
        }
    }
    public static void main(String args[])
    {
        Outer2 out = new Outer2();
        Outer2.Inner o1 = out.new Inner();
        o1.f1();
    }
}