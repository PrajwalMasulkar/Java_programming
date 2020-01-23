import java.util.Scanner;

class Sum2{
    public static void main(String[] args)
    {
        double n,sum=0.0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Enter a  no.");
            n=scan.nextDouble();
            sum += n;
        }while(n != 0);
        System.out.print("sum is : " + sum);
     }

        }