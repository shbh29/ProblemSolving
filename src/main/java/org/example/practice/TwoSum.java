package org.example.practice;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //take ith element in nums
        // do target - ith in nums in find variable
        // index of find variable
        for ( int i = 0; i < nums.length; i++) {
            int lookingFor = target - nums[i];
            for(int j = i+1; j < nums.length; j++) {
                if (nums[j] == lookingFor) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0,0};
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{3,3}, 6)));
//        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2,7,11,15}, 9)));
    }
}
