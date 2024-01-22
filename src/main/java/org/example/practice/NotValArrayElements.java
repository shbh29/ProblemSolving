package org.example.practice;

import static java.util.Arrays.sort;

public class NotValArrayElements {
    public int removeElement(int[] nums, int val) {
        int nvIndex = 0;
        /**
         * 3,2,2,3      val = 3;
         * 2,2,_,_
         */
        int i = 0;
        while(i < nums.length) {
            if(nums[i] != val) {
                nums[nvIndex++] = nums[i];
            }
            i++;
        }

        return nvIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3}; // Input array
        int val = 3; // Value to remove
//        int[] expectedNums = [...]; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = new NotValArrayElements().removeElement(nums, val); // Calls your implementation

        System.out.println("expected count: "+k);// k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            System.out.print(" "+ nums[i]);
        }
        System.out.println();
    }
}
