//sum of border
import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int x = 0;
        int a[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = obj.nextInt(); 
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0|| j==0|| i==n-1||j==n-1)
                x = x + a[i][j];
            }
        }
        System.out.print(x);
    }
}