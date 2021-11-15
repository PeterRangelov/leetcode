import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Person p1 = new Person("A", 1);
    Person p2 = new Person("B", 2);
    Person p3 = new Person("C", 3);
    Person p4 = new Person("D", 2);

    List<Person> people = new ArrayList<>();
    people.add(p1);
    people.add(p2);
    people.add(p3);
    people.add(p4);

    List<Person> peopleToRemove = new ArrayList<>();

    people.forEach(p -> {
      if (p.age == 2) {
        System.out.println(p);
        peopleToRemove.add(p);
      }
    });

    people.removeAll(peopleToRemove);

    System.out.println(people);

  }

  static class Person {
    String name;
    int age;

    Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

}
