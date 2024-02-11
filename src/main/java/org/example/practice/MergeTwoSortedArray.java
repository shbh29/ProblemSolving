package org.example.practice;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] n1 = Arrays.copyOf(nums1,m);

        /**
         * continue loop till both i and j less the respective lengths.
         */
        int numIndex = 0;
        int i = 0, j = 0;
        while(i < n1.length && j < nums2.length  && numIndex < nums1.length) {
            if(n1[i] <= nums2[j]) {
                nums1[numIndex++] = n1[i++];
            } else {
                nums1[numIndex++] = nums2[j++];
            }
        }

        while(i < n1.length && numIndex < nums1.length) {
            nums1[numIndex++] = n1[i++];
        }

        while(j < nums2.length && numIndex < nums1.length) {
            nums1[numIndex++] = nums2[j++];
        }

    }

    public static void main(String[] args) {
        int[] num1 = new int[] {1,2,3,4,5,0,0,0,0};
        int[] num2 = new int[] {1,2,2,2};
        new MergeTwoSortedArray().merge(num1, num1.length, num2, num2.length);
        System.out.println(Arrays.toString(num1));
    }
}
