import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i == 0){
                sum++; 
                System.out.print(i+" ");
            }
        }
    }
}