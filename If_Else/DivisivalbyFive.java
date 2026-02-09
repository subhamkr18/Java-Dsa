import java.util.Scanner;
public class DivisivalbyFive {
    public static void main(String[] args){
        Scanner su= new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n= su.nextInt();

        if(n%5 ==0){
            System.out.print(n);
            System.out.print(" is Divisible by 5");
        }
        else{
            System.out.print(n);
            System.out.print(" is not Divisible by 5");
        }
    }
}
