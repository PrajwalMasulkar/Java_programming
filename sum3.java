import java.util.Scanner;

class sum3{
    public static void main(String[] args)
    {
        int n1,n2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        n1=scan.nextInt();
        n2=scan.nextInt();
        int sum=n1+n2;
        System.out.print("Sum is: "+sum);
    }

}