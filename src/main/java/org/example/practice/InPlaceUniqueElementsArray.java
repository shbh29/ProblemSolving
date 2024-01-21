package org.example.practice;


public class InPlaceUniqueElementsArray {
    public int removeDuplicates(int[] nums) {
        /**
         * loop on nums
         * 1,1,2
         * 1,2,2
         * 0,0,1,1,1,2,2,3,3,4
         * 0,0,1,1,1,2,2,3,3,4
         */
        /**
         * loop till number is same as current number.
         * put current number in unique index
         * loop till end
         */
        int ui = 0;
        int current = nums[0];
        int i = 0;
        while(i < nums.length) {
            current = nums[i];
            // loop till same number or array end
            while (i < nums.length && current == nums[i]) {
                i++;
            }
            nums[ui++] = current;
        }

        return ui;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums = new int[]{0,1,2,3,4,}; // The expected answer with correct length

        int k = new InPlaceUniqueElementsArray().removeDuplicates(nums); // Calls your implementation

        System.out.println("expected length: "+ (k));
        for (int i = 0; i < k; i++) {
            System.out.print(" "+nums[i]);
        }
        System.out.println();
    }
}
