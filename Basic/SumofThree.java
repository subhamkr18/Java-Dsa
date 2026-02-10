// Take 3 intiger input and print their addition , subtraction and multiplication 

import java.util.Scanner;
public class SumofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First no: ");
        int a= sc.nextInt();

        System.out.print("Enter Second no: ");
        int b= sc.nextInt();

        System.out.print("Enter Third no: ");
        int c= sc.nextInt();

        // Caculating and printing sum
        System.out.println("Sum: "+ (a+b+c) );

        //Caculating and printing Subtraction
        System.out.println("Subtraction: "+ (a-b-c) );

        //Caculating and printing Multiplication
        System.out.println("Multiplication: "+ (a*b*c) );
    }
}
