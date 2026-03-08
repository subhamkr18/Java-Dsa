package Arrays;

import java.util.Scanner;
public class Max{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n= sc.nextInt();
        int[] arr =new int[n];

        int Max=0;
        

        // Array Input
        for(int i=0; i<n;i++){
            System.out.print("Enter " +i+ " elements: ");
            arr[i] = sc.nextInt();
        }Max=arr[0];// assuming 1 array element is max 

        // Find Maximum element of an array
        for(int i=0; i<n;i++){
            
            if(arr[i]>Max){ // condition to compare Max with each element
                Max =arr[i];
            }
        }
        System.out.println("Max of elements of array : "+Max);

    }
  
}
