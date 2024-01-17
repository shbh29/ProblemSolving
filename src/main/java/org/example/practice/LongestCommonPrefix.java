package org.example.practice;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // abcd, ab,
        if (strs.length == 1) { return strs[0]; }
        StringBuilder prefixString = new StringBuilder();
        int strIndex = 0;
        boolean isNotSame = false;
        // find the shortest string of all
        String minStr = Arrays.stream(strs)
                .min(Comparator.comparing(String::length))
                .get();
        /**
         * example: {abcd, ab, abhinav, abhilasha}
         * loop till length of all characters of current string
         * loop to check if all first characters are a then add a in final prefixString.
         */
        while (strIndex < minStr.length()) {
            // loop for every current character until its same. as soon as mismatch break the loop
            // after all the elements traverse, update single character in prefix string

            // loop every strIndex character in the array.
            int arrIndex = 0;
            while(arrIndex < strs.length - 1) {
                if (strs[arrIndex].charAt(strIndex) != strs[arrIndex+1].charAt(strIndex)) {
                    isNotSame = true;
                    break;
                }
                arrIndex++;
            }

            // after character loop // check and add prefix character
            if(isNotSame) { break; } else { prefixString.append(strs[0].charAt(strIndex)); }


            // check for next character
            strIndex++;
        }

        return prefixString.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"abhcd", "din", "abhinav"}));
    }
}
