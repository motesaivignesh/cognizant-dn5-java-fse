import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionDemo {

    public static void main(String[] args) {

        try {

            // Load class dynamically
            Class<?> cls = Class.forName("Calculator");

            System.out.println("Class Name: "
                    + cls.getName());

            // Get all methods
            Method[] methods =
                    cls.getDeclaredMethods();

            System.out.println("\nMethods:");

            for (Method method : methods) {

                System.out.println(
                        "Method Name: "
                                + method.getName());

                Parameter[] params =
                        method.getParameters();

                System.out.println(
                        "Number of Parameters: "
                                + params.length);

                for (Parameter p : params) {
                    System.out.println(
                            "Parameter Type: "
                                    + p.getType().getSimpleName());
                }

                System.out.println();
            }

            // Create object dynamically
            Object obj =
                    cls.getDeclaredConstructor()
                            .newInstance();

            // Invoke display()
            Method m =
                    cls.getDeclaredMethod(
                            "display");

            m.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}