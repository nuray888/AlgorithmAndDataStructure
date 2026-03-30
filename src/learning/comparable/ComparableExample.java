//package learning.comparable;
//
//import java.util.*;
//
//class Student implements Comparable<Student> {
//    String name;
//    int id;
//
//    public Student(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//
//    @Override
//    public int compareTo(Student other) {
//        // Compare students based on their IDs
//        return Integer.compare(this.id, other.id);
//    }
//
//    @Override
//    public String toString() {
//        return "Student{name='" + name + "', id=" + id + '}';
//    }
//}
//
//public class ComparableExample {
//    public static void main(String[] args) {
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Alice", 101));
//        studentList.add(new Student("Bob", 102));
//        studentList.add(new Student("Charlie", 100));
//
//        // Sort the list using Comparable
//        Collections.sort(studentList);
//
//        // Print the sorted list
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
//    }
//}
