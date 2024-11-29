import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String Name = obj.nextLine();
        double Score = obj.nextDouble();
        obj.nextLine();
        String Department = obj.nextLine();
        System.out.println(Name);
         System.out.println(Score/10);
          System.out.print(Department);
    }
}