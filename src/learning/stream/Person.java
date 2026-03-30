package learning.stream;

public class Person {
    String name;
    Integer salary;

    public Person(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }
    public void hello(){
        System.out.println("hello"+this.name);
    }
}
