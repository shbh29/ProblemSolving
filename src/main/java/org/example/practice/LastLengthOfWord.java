package org.example.practice;

public class LastLengthOfWord {
    public int lastLengthOfWord(String s) {
        // "abcd dd "
        // "pqr dd"
        // "dddd"
        int len = s.length() - 1;
        while(s.charAt(len) == ' ') { len--; }
        int cnt = 0;
        for( int i = len; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                return cnt;
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(new LastLengthOfWord().lastLengthOfWord("abc dd ")); // expected 2
        System.out.println(new LastLengthOfWord().lastLengthOfWord("abc ddfd")); //expected 4
        System.out.println(new LastLengthOfWord().lastLengthOfWord("abc")); // expected 3
    }
}
