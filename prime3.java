// twisted prime No
import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int rev = 0;
        int count = 0;
        int rcount=0;
        for(int i=1; i<=n; i++){
            if(n%i==0) 
            count++;
        }
        while(n>0){
            int c = n%10;
            rev = (rev * 10) + c;
            n/=10; 
        }
        for(int i=1; i<=rev; i++){
            if(rev%i == 0) 
            rcount++;
        }
        System.out.print((count==2 && rcount==2)?("Twisted Prime"):("Not Twisted prime"));
    }
}