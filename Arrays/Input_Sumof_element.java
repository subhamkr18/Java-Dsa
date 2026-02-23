package Arrays;
import java.util.Scanner;
public class Input_Sumof_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n= sc.nextInt();
        int[] arr =new int[n];

        int sum=0;
        

        // Array Input
        for(int i=0; i<n;i++){
            System.out.print("Enter " +i+ " elements: ");
            arr[i] = sc.nextInt();
        }

        // Calculating Sum of elements
        for(int i=0; i<n;i++){
            sum += arr[i];
        }
        System.out.println("sum of elements of array : "+sum);

    }
}
