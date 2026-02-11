package Loops;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        
        int count =0;
        if(n==0) n=1;
        while(n!=0){
            n /= 10;
            count += 1;
        }
        System.out.println(count);
        
    }
}
