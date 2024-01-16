package org.example.Programs;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private int age;
    private LocalDate joining;

    public Employee(String name, int age, LocalDate joining) {
        this.name = name;
        this.age = age;
        this.joining = joining;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getJoining() {
        return joining;
    }
}

public class Programs {

    /**
     * abcd
     * d (abc)
     * c (ab)
     * b (a)
     * a
     */

    private static void reverse(String s) {
        int length  = s.length();
        if(length>0) {
            System.out.print(s.charAt(length - 1));
            reverse(s.substring(0, length - 1));
        }
    }

    /**
     *
     * select * from Employee order by salary dec limit
     */

    public static void main(String[] args) {
        String s = "abcd";
        reverse("abcd");
    }
}
