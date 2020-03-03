interface Interfaces
{
    void show();
}
class Test implements Interfaces
{
    public void show()
    {
        System.out.println("1");

    }
    public static void main(String[] args)
    {
        Test t = new Test();
        t.show();
    }
}