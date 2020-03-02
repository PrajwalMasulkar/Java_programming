class CounterDem
{
    int count=0;
    CounterDem()
    {
        count++;
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        CounterDem c1=new CounterDem();
        CounterDem c2=new CounterDem();
        CounterDem c3=new CounterDem();

    }
}
