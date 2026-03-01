package Arrays;
import java.util.Scanner;
public class MinAaray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n= sc.nextInt();
        int[] arr =new int[n];

        int Min=0;
        

        // Array Input
        for(int i=0; i<n;i++){
            System.out.print("Enter " +i+ " elements: ");
            arr[i] = sc.nextInt();
        }Min=arr[0];// assuming arr[0] is Min element

        // Finding Min elements of an array
        for(int i=0; i<n;i++){
            if(arr[i]<Min){
                Min=arr[i];
            }
        }
        System.out.println("Product of elements of array : "+Min);

    }
}
   

