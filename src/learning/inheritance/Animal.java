package learning.inheritance;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move(){
        System.out.println("Animal is moving");
    }
}
