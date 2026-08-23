//checking int value
import java.util.Scanner;
public class IsInt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Numer : ");
        double n= sc.nextDouble();
        int x = (int)n;
        if(n - x > 0) System.out.print(" Input number is Not an integer");
        else System.out.print("Input Number is an Integer");
    }
}
