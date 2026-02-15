package Pattern_Printing;
import java.util.Scanner;
public class Flipped_Tri_Using_vari {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        int a =n; //no of stars we have to print
        for(int i =1; i<=n; i++){
            for(int j=1; j<=a; j++){
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }
    }
}
