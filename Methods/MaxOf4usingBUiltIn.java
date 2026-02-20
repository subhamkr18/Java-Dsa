package Methods;
import java.util.Scanner;
public class MaxOf4usingBUiltIn{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 4 Integers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.print("Max:"+Math.max(Math.max(Math.max(a,b),c),d));
    }
}
