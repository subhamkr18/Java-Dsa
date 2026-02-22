package Arrays;

public class Print_neg_element_of_Array {
    public static void main(String[] args) {
        int arr[] ={-2,-76,98,-65,87};
        // Question print only neg element of array
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0) System.out.print(arr[i]+" ");
        }
    }
}
