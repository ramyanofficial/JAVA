// Find prime or not
import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count=0;
        for(int i=1; i<n; i++)
        {
        if(n%i == 0)
        count++;  
        }
        if(count==2)
        {
            System.out.print("Prime No");
        }
        else
        {
            System.out.print("Not a Prime No");
        }
    }
}