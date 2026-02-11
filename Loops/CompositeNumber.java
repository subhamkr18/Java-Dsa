package Loops;
import java.util.Scanner;
public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter N: ");
        int n= sc.nextInt();

        boolean flag = true;
        for (int i=1; i<=n-1; i++){
            if(n%2 ==0){// i to n ka ek factor nikla
                flag =false;
                break; // terminate when Condition meet not ittrate again
            }
        }
        if(n==1)System.out.println("Neither Prime nor Composite");
        else if(flag==false) System.out.println("Composite Number");
        else(flag==true) System.out.println("Prime Number");
    }
}
