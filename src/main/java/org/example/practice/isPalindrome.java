package org.example.practice;

public class isPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) { return false; }

        int reversed = 0;
        int temp = x;
        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp = temp / 10;
        }

        return reversed == x;
    }

    public static void main(String[] args) {
        System.out.println((new isPalindrome()).isPalindrome(121));
    }
}
