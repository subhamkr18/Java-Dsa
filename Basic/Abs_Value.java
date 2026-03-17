import java.util.Scanner;
public class Abs_Value{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Numer: ");
        int n= sc.nextInt();
        if(n<0){
            System.out.print(-n);
        }
        else{
            System.out.print(n);
        }
        // if(n<0) n= -n;
        // System.out.print(n);
    }
}