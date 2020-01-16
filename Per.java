import java.util.Scanner;

class Per
{
    public static void main(String[] xyz) {
        long n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextLong();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Permute(i, j) + " ");
            }
            System.out.println();
        }
    }

        public static long Permute(long i,long j)
        {
            return fact(i)/fact(i-j);
        }
        public static long fact(long n)
        {
            if(n<2)
                return 1;
            else
                return n*fact(n-1);
        }
}
