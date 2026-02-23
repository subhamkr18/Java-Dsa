package Arrays;
import java.util.Scanner;
public class input_Print_negElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enten array sine n: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        //Array input
        for(int i=0; i<n;i++){
            arr[i] =sc.nextInt();
        }

            //Printing negative array
            System.out.println("Negative Elements are");
            for(int i=0; i<n;i++){
                if(arr[i]<0)
                System.out.print(+arr[i]+" ");
            }
    }
}
