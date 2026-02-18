package Pattern_Printing;
import java.util.Scanner;
/*
    *
   **
  ***
 ****
*/
public class FlippedALPHATRI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)>n) System.out.print((char)(64+i)+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
