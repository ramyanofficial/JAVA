// neon number
// square and add the final ans
javac amicable1.javaimport java.util.Scanner;
class hello{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum = 0;
        int a=n*n;
        while(a>0)
        {
            int b = a%10;
            sum += b;
            a/=10;
        }
        System.out.print(sum == n?("YES"):("NO"));
    }
}