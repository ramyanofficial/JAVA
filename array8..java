// K Value
import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a[] = new int[n];
        int x = 0;
        for(int i=0; i<n; i++){
            a[i] = obj.nextInt();
        }
        int k = obj.nextInt();
        for(int i=0; i<n; i++){
             for(int j=0; j<i; j++){
                if(a[i] + a[j] == k){
                    System.out.print(i + " " + j);
                    x=1;
                    break;
                }
                if(x==1)
                break;
            }
        }
    }
}