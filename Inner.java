class Inner{
    int a =10;
    class Inn{
        void f1()
        {
            System.out.println("Inn :-Inner class ");

        }

    }
    public static void main(String[] args)
    {
        Inner out = new Inner();
        Inner.Inn lo = out.new Inn();
        lo.f1();
    }


}