package Loops;
import java.util.Scanner;
public class AP {
    public static void main(String[] args) {

        // AP = a-first term , d=comman Diffrence, n- no of terms
        // AP= a, a+d, a+2d.....
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter First Term(a): ");
        int a= sc.nextInt();

        System.out.print("Enter Comman Difference(d): ");
        int d= sc.nextInt();

        System.out.print("Enter No of Terms(n): ");
        int n= sc.nextInt();

        // first term= a, Last Term= (a+(n-1)*d)
        for(int i=a;i<= (a+(n-1)*d); i+=d) System.out.print(i + " ");
        // if we enter d as neg the lopp terminates becouse condition fails
    }
}
