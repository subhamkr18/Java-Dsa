// Calculate Simple Intrest

import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        double p= sc.nextDouble();

        System.out.print("Enter Rate of Intrest: ");
        double r= sc.nextDouble();

        System.out.print("Enter Time in Year: ");
        Double t= sc.nextDouble();

        double si= (p*r*t) / 100;
        System.out.print("Simple Intrest is: "+si);

    }
}
