package Searching_Sorting.Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int nums[]={3,5,7,1,2};
        int key=0;
        int size = nums.length;
        int j=0;

        // Printing Befor Sorting
        System.out.println("Before Sorting");
        for(int num : nums){
            System.out.print(num+" ");
        }


        //Insertin sort
        for(int i=1;i<size;i++){
            key=nums[i];
            j=i-1;

            while(j >= 0 && nums[j] > key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }

        // Printing After Sorting
        System.out.println();
        System.out.println("After Sorting");
        for(int num : nums){
            System.out.print(num+" ");
        }

        // int nums[]={2,7,9,12,1};
        // System.out.println("Before Sorting");
        // for(int n : nums){
        //     System.out.print(n+" ");
        // }
        // //insertion sort
        // for(int i=1;i<nums.length;i++){
        //     int key=nums[i];
        //     int j=i-1;

        //     while(j>=0 && nums[j]>key){
        //         nums[j+1]=nums[j];
        //         j--;
        //     }
        //     nums[j+1]=key;
        // }
        // System.out.println();
        // for(int n : nums){
        //     System.out.print(n+" ");
        // }

     }
}
