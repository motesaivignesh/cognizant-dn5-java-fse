import java.util.concurrent.*;
import java.util.concurrent.Callable;

class Task implements Callable<Integer> {

    private int number;

    public Task(int number) {
        this.number = number;
    }

    @Override
    public Integer call() {

        System.out.println(
                Thread.currentThread().getName()
                        + " processing "
                        + number);

        return number * number;
    }
}

public class ExecutorCallableDemo {

    public static void main(String[] args)
            throws Exception {

        ExecutorService service =
                Executors.newFixedThreadPool(3);

        Future<Integer> f1 =
                service.submit(new Task(2));

        Future<Integer> f2 =
                service.submit(new Task(4));

        Future<Integer> f3 =
                service.submit(new Task(6));

        System.out.println(
                "Result 1 = " + f1.get());

        System.out.println(
                "Result 2 = " + f2.get());

        System.out.println(
                "Result 3 = " + f3.get());

        service.shutdown();
    }
}