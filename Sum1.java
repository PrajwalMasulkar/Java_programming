import java.util.Scanner;
class Sum1{
    public static void main(String[] args){
        int sum=0,n;
        Scanner scan= new Scanner(System.in);
        n= scan.nextInt();
        while(n != 0){
            sum += n;
            --n;
        }
        System.out.println("sum is : " +sum);
    }
}