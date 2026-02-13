package Pattern_Printing;
import java.util.Scanner;
public class ALPHA_PATTERN{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =sc.nextInt();

        for(int i=1; i<=n;i++){
            for(int j=65; j<=64+n;j++){
                System.out.print((char)j+" ");
            }System.out.println();
        }
    }
}
