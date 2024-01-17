package org.example.practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToLetter {

    public int romanToInt(String s) {
        int number = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for( int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            int sign = 1;
            if (i < s.length() - 1) {
                char c1 = s.charAt(i + 1);
                if (map.get(c) < map.get(c1)) {
                    sign = -1;
                }
            }

            switch (c) {
                case 'M':
                    number += 1000 * sign; break;
                case 'D':
                    number += 500 * sign; break;
                case 'C':
                    number += 100 * sign; break;
                case 'L':
                    number += 50 * sign; break;
                case 'X':
                    number += 10 * sign; break;
                case 'V':
                    number += 5 * sign; break;
                case 'I':
                    number += sign; break;
                default:
            }
        }

        return number;
    }

    public static void main(String[] args) {
        System.out.println((new RomanToLetter()).romanToInt("XLI"));
    }
}
