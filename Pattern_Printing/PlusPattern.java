package Pattern_Printing;
import java.util.Scanner;
/*
    *
    *
* * * * *
    * 
    * 
*/
public class PlusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==(n/2)+1 || j==(n/2)+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
    //if n is even it will not split properly
}
