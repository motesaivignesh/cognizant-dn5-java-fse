import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Vignesh");
        names.add("Deepthi");
        names.add("Ravi");
        names.add("Anjali");
        names.add("Kiran");

        System.out.println("Before Sorting:");
        System.out.println(names);
        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("\nAfter Sorting:");
        System.out.println(names);
    }
}