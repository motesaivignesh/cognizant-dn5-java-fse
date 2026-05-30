import java.util.List;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {

        Person p1 = new Person("Vignesh", 20);
        Person p2 = new Person("Deepthi", 18);
        Person p3 = new Person("Ravi", 25);
        Person p4 = new Person("Anjali", 22);
        System.out.println("Person Details:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        List<Person> persons = List.of(p1, p2, p3, p4);

        System.out.println("\nPersons with age > 20:");

        persons.stream()
               .filter(person -> person.age() > 20)
               .forEach(System.out::println);
    }
}