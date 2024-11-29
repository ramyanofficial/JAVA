//print repeated value

import java.lang.System;import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt(); 
        }
        for(int i=0; i<n; i++){
            count=0;
            for(int j=i+1; j<n; j++){
                if(a[i] == a[j] && a[i]!=0){
                    count++;
                    a[j]=0;
                }
            }
            if(count>0){
                System.out.print(a[i]+ " ");
            }
        }
    }
}
