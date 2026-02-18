package Pattern_Printing;
import java.util.Scanner;
public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        int nsp =1, nst=n/2;
        int st=1;
        
        for(int i=1;i<=n;i++){
            System.out.print("*"+" ");
        } System.out.println();
        for(int i=1;i<=(n/2)+1;i++){
            
            for(int j=1;j<=nst;j++){
                System.out.print("*"+" ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" "+" ");
            }for(int l=1;l<=nst;l++ ) System.out.print("*"+" ");
            nst--;
            nsp +=2;
            System.out.println();
        }
    }
}
