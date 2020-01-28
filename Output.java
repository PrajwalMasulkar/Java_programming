class Output
{
    static int x=10; int y=20;
    public static void main(String args[])
    {
        Test t1=new Output();
        t1.x=888; t1.y=999;
        Test t2=new Output();
        t2.y =30;
        System.out.println(t1.x + t2.y);
    }
}
