package Loops;
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        // Display GP- 1,2,,4,8
        Scanner sc =new Scanner(System.in);
        System.out.print("ENter no of Terms(n): ");
        int n= sc.nextInt();

        int a = 1;
        int r = 2;

        for(int i=1; i<=n;i++){
            System.out.print(a + " ");
            a= a*r;
        }
    }
    
}
