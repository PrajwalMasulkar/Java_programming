class StaticInn{
    static int a =10;
    static class Inner
    {
        int p;
        static void f1()
        {
            System.out.println("Inner class");
            System.out.println(a);
        }
        Inner(){
            this(20);
            System.out.println("Java Programming");
        }
        Inner(int p){this.p=p;
        System.out.println("Java Programming - 1");
        System.out.println(p);

        }
    }
    public static void main(String args[])
    {
        StaticInn.Inner lo = new StaticInn.Inner();
        lo.f1();
    }
}