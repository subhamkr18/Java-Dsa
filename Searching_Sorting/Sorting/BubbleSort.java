package Searching_Sorting.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[]= {1,4,77,10,9,2,13};
        int size= nums.length;
        int temp=0;
        int step=0;

        // printing array before sorting
        System.out.println("Before Sorting");
        for(int n : nums){
            System.out.print(n+" ");
        }

        // sorting 

        for(int  i=0;i<size;i++){
            for(int j =0;j<size-i-1;j++){
                step++;
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        //Printing array after sorting
        System.out.println();
        System.out.println("After sorting Sorting");
        for(int n : nums){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("no of step taken "+step);
    }
}

