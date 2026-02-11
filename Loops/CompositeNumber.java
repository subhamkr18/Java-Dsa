package Loops;
import java.util.Scanner;
public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter N: ");
        int n= sc.nextInt();

        for (int i=1; i<=n-1; i++){
            if(n%2 ==0){// i to n ka ek factor nikla
                System.out.println("Composite Number");
                break; // terminate when Condition meet not ittrate again
            }
        }
    }
}
