//how many number
// enter the number
// find factor
// divide the no of factoe by 2
// count the number
import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = 0;
            int x = obj.nextInt();
            for(int j=1; j*j<=x; j++){
                if(x%j == 0){
                    sum++; 
                }
            }
            System.out.println(sum);
        }
    }
}