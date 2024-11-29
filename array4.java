//sum of diagonal input
import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int row=3,col=3;
        int x = 0;
        int a[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                a[i][j] = obj.nextInt(); 
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++)
            {
               if(i == j){
                x = x + a[i][j];
                }
            }
        }
        System.out.print(x);
    }
}