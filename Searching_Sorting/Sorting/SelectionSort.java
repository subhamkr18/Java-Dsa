package Searching_Sorting.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[]={1,4,77,10,9,2,13};
        int size = nums.length;
        int temp = 0;
        int minIndex =-1;
        int step =0;

        // Printing Befor Sorting
        System.out.println("Before Sorting");
        for(int num : nums){
            System.out.print(num+" ");
        }

        //Selection Sort
        for(int i=0; i<size-1;i++){
            minIndex=i;
            for(int j=i+1;j<size-1;j++){
                step++;
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i]=temp;
        }

        // Printing After Sorting
        System.out.println();
        System.out.println("After Sorting");
        for(int num : nums){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("no of step Taken "+step);
    }
}

