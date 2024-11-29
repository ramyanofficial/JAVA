import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner character = new Scanner(System.in);
        String a = character.nextLine();
        String b = character.nextLine();
        int c = character.nextInt();
        System.out.print(a+b+c);
    }
}