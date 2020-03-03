interface Interf
{
    void show();
}
interface Interf1
{
    void display();
}

class Test implements Interf,Interf1
{
    public void show()
    {
        System.out.println("1");

    }
    public void display()
    {
        System.out.println("2");
    }
    public static void main(String[] args)
    {
        Test t = new Test();
        t.show();
        t.display();
    }
}