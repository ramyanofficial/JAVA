// print up to give n prime number
import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int c=0;
        for(int k=1; k<=n; k++){
            for(int i=1; i<=n; i++){
                if(n%i == 0)
                c++;{
                }
                if(c==2){
                    System.out.print(k + " ");
                }
            }
        }
    }
}