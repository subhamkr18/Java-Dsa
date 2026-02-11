package Loops;
import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        
        int Sum=0;
        
        while(n!=0){
            Sum += n%10;
            n /= 10;
        }
        System.out.println("Sum of Digits: " + Sum);
        
    }
}
