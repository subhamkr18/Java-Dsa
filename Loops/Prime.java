package Loops;

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        boolean flag = true;
        for(int i=1; i<= Math.sqrt(n);i++){
            if(n%i ==0){
                flag = false;
                break;
            }
            
        }
        if(n==1) System.out.println("Neither Prime Nor Composite");
        else if(flag==true)System.out.println("Prime Number");
        else if(flag==false) System.out.println("Not Prime");
    }
}
