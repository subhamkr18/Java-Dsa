package Pattern_Printing;
import java.util.Scanner;
public class ALPHA_TRINGLE_VERTICALY_FLIPPED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}
