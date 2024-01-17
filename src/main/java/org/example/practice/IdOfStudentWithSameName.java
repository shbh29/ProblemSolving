package org.example.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IdOfStudentWithSameName {

    class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    "}";
        }
    }

    private List<Integer> getIdOfStudentWithSameName() {
        List<Student> studentsList = Arrays.asList(
                new Student(1, "Shubham"),
                new Student(2, "Sneha"),
                new Student(3, "Archana"),
                new Student(4, "Sneha"),
                new Student(5, "Archana"),
                new Student(6, "Sneha"),
                new Student(7, "Akhil"),
                new Student(8, "Jain")
        );

        return studentsList.stream()
                .collect(Collectors.groupingBy(Student::getName))
                .entrySet().stream()
                .filter(e -> e.getValue().size() > 1)
                .flatMap(e -> e.getValue().stream())
                .map(Student::getId)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(new IdOfStudentWithSameName().getIdOfStudentWithSameName());
    }
}
