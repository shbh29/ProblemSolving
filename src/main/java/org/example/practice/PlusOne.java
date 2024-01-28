package org.example.practice;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[] {2, 3, 5}))); // expected 2, 3, 6
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[] {8, 9, 9}))); // expected 9,0,0
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[] {9, 9, 9}))); // expected 1,0,0,0
    }
}
