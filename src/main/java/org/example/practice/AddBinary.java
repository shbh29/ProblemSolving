package org.example.practice;

public class AddBinary {
    public String addBinary(String a, String b) {
        /**
         * 10 + 10 = 100
         */
        boolean isCarry = false;
        int alen = a.length() - 1;
        int blen  = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        while(alen >= 0 && blen >= 0) {
            char ai = a.charAt(alen--);
            char bi = b.charAt(blen--);
            if( ai == bi) {
                // 0+0 and 1+1
                if(isCarry){
                    sb.insert(0, 1);
                    isCarry = false;
                } else {
                    sb.insert(0, 0);
                }
                // ai as well as bi
                if (ai == '1') {
                    isCarry = true;
                }
            } else { // 0 + 1 || 1 + 0
                // carry not modified
                if(isCarry) {
                    sb.insert(0, '0');
                } else {
                    sb.insert(0, '1');
                }
            }
        }
        while(alen >= 0) {
            char ai = a.charAt(alen--);
            if(isCarry && ai == '1') {
                sb.insert(0, 0);
                // keep carry true
            } else if (isCarry && ai == '0'){
                // if ai is 0;
                sb.insert(0, 1);
                isCarry = false;
            } else {
                sb.insert(0, ai);
            }
        }


        while(blen >= 0) {
            char bi = b.charAt(blen--);
            if(isCarry && bi == '1') {
                sb.insert(0, 0);
                // keep carry true
            } else if (isCarry && bi == '0'){
                // if ai is 0;
                sb.insert(0, 1);
                isCarry = false;
            } else {
                sb.insert(0, bi);
            }
        }

        if(isCarry) {
            sb.insert(0, 1);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("10", "10")); // expected 100
        System.out.println(new AddBinary().addBinary("11", "11")); // expected 110
        System.out.println(new AddBinary().addBinary("1010", "10")); // expected 1100
        System.out.println(new AddBinary().addBinary("1010", "11111")); // expected 101001
    }
}
