package org.example.practice;

public class IndexOfHaystackNeedle {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null) {return -1;}
        int nlen = needle.length();
        int hlen = haystack.length();
        /**
         * height
         * ght
         */
        for(int i = 0; i < hlen; i++) {
            // if first character match
            // loop to match complete ni
            // if ni == needle.length() then return i - needle.length()
            int ni = 0;
            int tempi = i;
            while (tempi < hlen && ni < nlen && needle.charAt(ni) == haystack.charAt(tempi)) {
                tempi++;
                ni++;
            }
            if (ni == nlen) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new IndexOfHaystackNeedle().strStr("heigighight", "ight"));
    }
}
