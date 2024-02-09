package org.example.practice;

public class ClimbingStairs {
    public int climbStairs(int n) {
/**
 * 2 -> 1+1, 2 = 2
 * 3 -> 1+1+1, 2+1, 1+2 = 3
 * 4 -> 1+1+1+1, 1+2+1, 2+1+1, 1+1+2, 2+2 = 5
 * 5 -> 1+1+1+1+1, 1+1+1+2, 1+1+2+1, 1+2+1+1, 2+1+1+1, 2+1+2, 2+2+1, 1+2+2 = 8
 * 6 -> 1+1+1+1+1+1, 1+1+1+1+2, 1+1+1+2+1, 1+1+2+1+1, 1+2+1+1+1, 2+1+1+1+1, 2+1+1+2, 2+1+2+1, 2+2+1+1, 1+2+2+1, 1+1+2+2, 2+2+2 = 12
 */
        int f1 = 0, f2 = 1;
        int f3 = f1 + f2;
        int i = 0;
        while (i++ < n) {
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        return f3;
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(2));
        System.out.println(new ClimbingStairs().climbStairs(3));
        System.out.println(new ClimbingStairs().climbStairs(4));
        System.out.println(new ClimbingStairs().climbStairs(5));
        System.out.println(new ClimbingStairs().climbStairs(6));
        System.out.println(new ClimbingStairs().climbStairs(7));
    }
}
