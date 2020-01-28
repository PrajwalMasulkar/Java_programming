import java.util.Scanner;
public class Transpose1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter no of rows : ");
        int a = scan.nextInt();
        System.out.print("\nEnter no. of columns : ");
        int b = scan.nextInt();
        int row = a;
        int column = b;
        int[][] M1=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                M1[i][j] = scan.nextInt();
            }
        }
        display(M1);
        int[][] T1=new int[column][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                T1[j][i] = M1[i][j];
            }
        }
        display(T1);

    }
    public static void display(int[][] matrix){
        System.out.println("The Matrix is: ");
        for(int[] row: matrix){
            for(int column : row){
                System.out.print(column+ " ");

            }
            System.out.println();
        }

    }
}