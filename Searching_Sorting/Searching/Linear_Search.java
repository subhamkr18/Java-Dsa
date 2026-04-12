package Searching_Sorting.Searching;

public class Linear_Search {
    public static void main(String[] args) {
        int nums[] = {4, 87, 67, 888, 97};
        int target = 888;

        int result = linearSearch(nums, target);

        if (result != -1) {
            System.out.println("Found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int step=0;
        for (int i = 0; i < nums.length; i++) {
            step++;
            if (nums[i] == target) {
                System.out.println("It will take "+step + " Steps");
                return i;
            }
        }
        System.out.println("It will take "+step + " Steps");
        return -1;
    }
}


