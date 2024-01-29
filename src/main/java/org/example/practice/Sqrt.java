package org.example.practice;

public class Sqrt {
    public int mySqrt(int x) {
        if (x < 2) return x;
        if (x == 2) return 1;
        long l = 2;
        long r = x / 2;
        long m = (l + r) / 2;
        while (l <= r) {
            m = (l + r) / 2;
            if (m*m == x) {
                return (int) m;
            } else if( m*m > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if ( m*m > x) { return (int) m - 1; } else { return (int) m; }
    }

    public static void main(String[] args) {
        System.out.println(new Sqrt().mySqrt(4)); // expected 2
        System.out.println(new Sqrt().mySqrt(0)); // expected 0
        System.out.println(new Sqrt().mySqrt(1)); // expected 1
        System.out.println(new Sqrt().mySqrt(2)); // expected 1
        System.out.println(new Sqrt().mySqrt(8)); // expected 2
        System.out.println(new Sqrt().mySqrt(9)); // expected 3
        System.out.println(new Sqrt().mySqrt(15)); // expected 3
        System.out.println(new Sqrt().mySqrt(2147395600)); // expected 46340
    }
}
