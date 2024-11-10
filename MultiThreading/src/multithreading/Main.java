package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 5;

        Producer producer = new Producer(queue, maxSize);
        Consumer consumer = new Consumer(queue, maxSize);

        producer.start();
        consumer.start();
    }
}
