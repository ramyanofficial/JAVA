
import java.lang.System;import java.util.Scanner;
class hello{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a[] = new int[n];
        int count = 0;
        for(int i=0; i<n; i++){
            a[i] = obj.nextInt();
            count=n;
            for(int j=0; j<n; j++){
                if(j<i){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}