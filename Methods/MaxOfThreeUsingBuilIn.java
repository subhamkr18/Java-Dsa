package Methods;
import java.util.Scanner;
public class MaxOfThreeUsingBuilIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a =sc.nextInt();
        System.out.print("Enter b: ");
        int b =sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        // finding max of a,b
        int x = Math.max(a,b);
        int max = Math.max(x,c);
        System.out.print("Max of "+a+" "+b+" "+c+" is: "+max);
    }
}
