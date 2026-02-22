package Arrays;
import java.util.Scanner;
public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr={5,-8,67,43,-97};
        // // length of array
        // int n = arr.length;
        // //print array using loop
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        

        int[] Subham = new int[7];// default valur Subham[i]=0
        
        // if we not assign vslue to this array its defalut value for each element is 0
        // for(int i=0; i<7;i++) System.out.print(Subham[i]+" ");
        
        //input
        for(int i=0; i<7;i++){
            // int x = sc.nextInt();
            // Subham[i]=x;
            System.out.println("Enter " +(i+1)+" element: ");
            Subham[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++){
            System.out.print(Subham[i]+" ");
        }
        }
    }

