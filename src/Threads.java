import model.TestModel;

import java.util.TreeSet;
import java.util.stream.IntStream;

public class Threads {
    public static void main(String[] args) throws InterruptedException{

        System.out.println(Thread.currentThread().getName());

        Thread deemonThread = new Thread(() -> IntStream.rangeClosed(1,100000)
                                    .forEach(System.out::println));

        deemonThread.setDaemon(true);
        deemonThread.start();

        Thread.sleep(10);

        System.out.println(Thread.currentThread().getName());

    }
}
