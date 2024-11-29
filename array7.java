//find difference of cross diagonal input
import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int x1 = 0, x2=0;
        int sum=0;
        int a[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = obj.nextInt(); 
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
            {
               if(i == j){
                x1 = x1 + a[i][j];
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
            {
               if(i+j == n-1){
                x2 = x2 + a[i][j];
                }
            }
        }
        sum = x1 - x2;
        System.out.print(sum);
    }
}