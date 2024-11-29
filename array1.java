// static matrix
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
            x = x + a[i];
            }
            System.out.print(x);
    }
}
