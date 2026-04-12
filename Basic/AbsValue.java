import java.util.Scanner;
public class AbsValue{
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
        // System.out.print(n);  // it will also work as upper code
    }
}