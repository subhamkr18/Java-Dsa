package Searching_Sorting.Searching;

public class Binary_Search {
    public static void main(String[] args) {
        int nums[] = {5, 7, 9, 11, 13}; // Sorted array
        int target = 11;

        int result = binarySearch(nums, target);

        if (result != -1) {
            System.out.println("Element Found at index " + result);
        } else {
            System.out.println("Element not Found");
        }
    }

    public static int binarySearch(int[] nums, int target) {
        int step=0;
        int start = 0;                      
        int end = nums.length - 1;          

        while (start <= end) {
            step++;
            int mid = (start + end) / 2;   

            if (nums[mid] == target) {
                System.out.println("It will take "+step + " Steps");
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("It will take "+step + " Steps");
        return -1;
    }
}

