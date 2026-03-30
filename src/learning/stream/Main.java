package learning.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("nUray",200));
        list.add(new Person("Aruz",500));

        list.forEach(Person::hello);
        List<Person> filteredList = list.stream().filter(person -> person.salary > 200).collect(Collectors.toList());

    }
}
