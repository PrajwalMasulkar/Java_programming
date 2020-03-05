import java.util.Scanner;

class Factorial{
    public static void main(String[] args)
    {    int a,fact=1;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        for(int i=1;i<=a;i++)
        {
            fact *= i;
        }
        System.out.print("Factorial of a Number :"+fact);

    }

}