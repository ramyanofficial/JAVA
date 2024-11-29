//GCD Problem

import java.lang.System;import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        for(int i = 1; i <= x; i++)
        {
            int n1 = obj.nextInt();
            int n2 = obj.nextInt();
            while(n2!=0)
            {
                x = n1 % n2;
                n1 = n2;
                n2 = x;
            }
            System.out.print(n1);
        }
    }
}