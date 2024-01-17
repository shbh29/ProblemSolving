package org.example.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        /**
         * take sorted array,
         * count occurrences of current character in a loop,
         *  update set with count once reached end of array or element next is changed.
         *  if any add in set returns false then return false or return true.
         */
        Arrays.sort(arr);
        Set<Integer> counterSet = new HashSet<>();
        int arrIndex = 0;
        // count occurrence
        while(arrIndex < arr.length) {
            int currentNumber = arr[arrIndex];

            int count = 0;
            // count every single element
            do {
                count++;
                arrIndex++;
            } while(arrIndex < arr.length && currentNumber == arr[arrIndex]);

            if(!counterSet.add(count)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(new UniqueNumberOfOccurences().uniqueOccurrences(new int[] {1,1,1,2,2,3})); //expected true
//        System.out.println(new UniqueNumberOfOccurences().uniqueOccurrences(new int[] {1,2})); //expected false
        System.out.println(new UniqueNumberOfOccurences().uniqueOccurrences(new int[] {-4, 3, 3})); //expected false
    }
}
