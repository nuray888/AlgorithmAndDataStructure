package learning.comparable;

import java.util.*;

class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + '}';
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bob", 102));
        studentList.add(new Student("Alice", 101));
        studentList.add(new Student("Charlie", 100));

        // Sort the list using a Comparator
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Compare students based on their names
                return s1.name.compareTo(s2.name);
            }
        });

        // Print the sorted list
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
