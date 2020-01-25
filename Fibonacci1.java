import java.util.Scanner;

class Fibonacci1{
    public static void main(String[] args){
    int n,x1=0,x2=1;
    Scanner scan = new Scanner(System.in);
    n=scan.nextInt();
    while(x1<=n){
        System.out.print(x1+"+ ");
        int sum = x1+x2;
        x1=x2;
        x2=sum;
    }
}
}

