package Pattern_Printing;
import java.util.Scanner;

public class StarRec_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter Col: ");
        int col = sc.nextInt();

        for (int i=1; i<=row; i++){
            for(int j=1; j<=col;j++){
                System.out.print("* "); // printing * controled by j
            }System.out.println(); // blank line controled by i
        }
    }
}
