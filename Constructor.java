class Constructor{
    int hour,min,sec;
    public Constructor()
    {
        hour = 0;
        min = 0;
        sec = 0;

    }
    public Constructor(int h)
    {
        hour = h;
        min = 0;
        sec = 0;

    }
    public Constructor(int h,int m)
    {
        hour = h;
        min = m;
        sec =0;

    }
    public constructor(int h,int m,int s)
    {
        hour = h;
        min =m;
        sec =s;

    }
    void printdata(){
        System.out.println(hour+"hours: "+min+"minute: "+sec+"sec: ");

    }

}
class Const3
{
    public static void main(String[] args)
    {
        Constructor t=new Constructor();
        t.printdata();
        Constructor t1=new Constructor(9);
        t1.printdata();
        Constructor t2=new Constructor(7,8);
        t2.printdata();
        Constructor t3=new Constructor(10,9,4);
        t3.printdata();
    }
}