package Arrays;
import java.util.Scanner;
public class Printing_EvanofanArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter no of Elements: ");
        int n= sc.nextInt();
        int[] arr =new int[n];

        //Inupt Array
        for(int i=0; i<n;i++){
            System.out.print("Enter " +i+ " elements: ");
            arr[i] = sc.nextInt();
        }

        //Evan element finding
        System.out.println("Even elements are:");
        for(int i=0; i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
