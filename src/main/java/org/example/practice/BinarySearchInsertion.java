package org.example.practice;

public class BinarySearchInsertion {
    public int searchInsert(int[] nums, int target) {
        /**
         * 2,4,6,8
         * 2,4,6,8
         * 2,4,6,8
         */
        int l = 0;
        int r = nums.length - 1;
        int m = (l + r) / 2;;
        while (l <= r) {
            m = (l + r) / 2;
            if (nums[m]==target) { return m; }
            else if ( nums[m] < target) { l = m + 1;}
            else { r = m - 1; }
        }
        if ( nums[m] < target) { return m + 1;}
        else { return m; }
    }

    public static void main(String[] args) {
        System.out.println(new BinarySearchInsertion().searchInsert(new int[]{2,4,6,8}, 5));// expected 2
        System.out.println(new BinarySearchInsertion().searchInsert(new int[]{2,4,6,8}, 3)); // expected 1
        System.out.println(new BinarySearchInsertion().searchInsert(new int[]{2,4,6,8}, 8)); // expected 3
    }
}
