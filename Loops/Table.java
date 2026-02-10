package Loops;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Integer Who's Table you want to print: ");
        int n= sc.nextInt();
        
        // for(int i=1; i<=10; i++) System.out.println(n+ "X"+ i+ " = " +(n*i));
    
        for(int i=n; i<= n*10; i+=n) System.out.println(n+ "X"+ i+ " = " + i);
    }

}
