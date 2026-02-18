package Pattern_Printing;

import java.util.Scanner;

public class PyramidUsingExtraVariable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        int nsp =n-1,  nst= 1; // nsp- no of space nst- no of stars
        for(int i=1; i<=n; i++){
            
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int k=1; k<=nst; k++){
                System.out.print("* ");
            }
            nsp--; // no of spaces decrement 
            nst +=2; //no of Star increment with 2
            System.out.println();
        }
    }
}
