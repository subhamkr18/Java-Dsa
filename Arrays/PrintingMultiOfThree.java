package Arrays;
import java.util.Scanner;
public class PrintingMultiOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr size of Array: ");
        int n =sc.nextInt();
        int[] arr= new int[n];

        // Array Input
        for(int i=0; i<n;i++){
            System.out.print("Enter "+i+" element: ");
            arr[i]=sc.nextInt();
        }

        //Checking and pring multiple of three
        System.out.print("Elements which are divisival by 3 are: ");
        for(int i=0;i<n;i++){
            if(arr[i]%3==0) System.out.print(arr[i]+" ");
        }
        

    }   
}
