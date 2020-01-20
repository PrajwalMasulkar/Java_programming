import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        char operator;
        Double n1,n2,result;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Operator +,-,*,/: ");
                operator= scan.next().charAt(0);
                System.out.print("enter n1 &n2: ");
                n1= scan.nextDouble();
                n2= scan.nextDouble();

        switch(operator){
            case '+':
                result=n1+n2;
                System.out.print(n1 +"+"+ n2 + " is: " +result);
                break;
            case '-':
                result=n1-n2;
                System.out.print(n1+ "-" +n2 + " is : " +result);
                break;
            case '*':
                result=n1*n2;
                System.out.print(n1+ "*" +n2 + " is: " +result);
                break;
            case '/':
                result=n1/n2;
                System.out.print(n1 +"/" +n2 + " is: " +result);
                break;
            default:
             System.out.println("Invalid Character");
            break;


        }
    }
}