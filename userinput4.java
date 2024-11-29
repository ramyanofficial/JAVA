// Reverse function
import java.util.Scanner;
class hello{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int rev = 0;
        while(n>0)
        {
            int c = n%10;
            rev = (rev*10) + c;
            n/=10;
        }
        System.out.print(rev);
    }
}