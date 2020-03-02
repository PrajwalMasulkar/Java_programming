class Super
{
    static int i =10;
}
class G extends Super
{
    int i=20;
    void show(int i)
    {
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(Super.i);
    }
    public static void main(String[] args)
    {
        G ob =new G();
        ob.show(30);

    }


}