// amicable number
//adding two integer factor
import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b= obj.nextInt();
        int h1 = 0, h2 = 0;
        for(int i=1; i<a; i++){
        if(a%i == 0){
            h1 = h1 + i;
            }
        }
        for(int j=1; j<b; j++){
        if(b%j == 0){ 
            h2 = h2 + j;
            }
        }
        System.out.println((h1==b && h2==a)?("Amicable"):("Not Amicable"));
    }
}