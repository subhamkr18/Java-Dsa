package Pattern_Printing;
import java.util.Scanner;
public class Flip_Alpha_Tri_Using_extra_Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        /*
        a b c d e
        a b c
        a b
        a
        */
        int a =n; //no of alpha we have to print
        
        for(int i=1; i<=n;i++){
            for(int j=1; j<=a; j++){
                System.out.print((char)(96+i)+" ");
            }
            a--;
            System.out.println();
        }


        /*
        A A A A A
        B B B B
        C C C
        D D
        E
        */

        /*
        for(int i=1; i<=n;i++){
            for(int j=1;j<=a;j++){
                System.out.print((char)(64+i)+" ");
            }
            a--;
            System.out.println();
        } 
             */
    }
}
