import java.util.Random;
class Findmin
{
   public static void main(String[] args)
   {
       Random random = new Random();
       for(int i=0;i<10;i++)
    {
        int m = random.nextInt(1000);
        int n = random.nextInt(1000);
        int y=Min(m,n);
        System.out.println("min of "+m+" , "+n+" is "+y);
    }
   }
static int Min(int x,int y)
{
    if(x<y) return x;
    else return y;
}
}
