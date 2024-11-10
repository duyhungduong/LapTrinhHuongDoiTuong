package b2103500;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerConsumer {
    private static final int N = 100; // Sức chứa của kho
    private static final AtomicInteger X = new AtomicInteger(0); // Số sản phẩm đã sản xuất
    private static final AtomicInteger[] K = new AtomicInteger[N]; // Kho sản phẩm

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm trong kho: ");
        int n = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            K[i] = new AtomicInteger(0);
        }

        Thread producer = new Thread(() -> {
            while (true) {
                produce();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                consume();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();

        System.out.println("Nhấn phím bất kì để dừng chương trình...");
        scanner.nextLine();
        producer.interrupt();
        consumer.interrupt();
    }

    private static void produce() {
        if (X.get() < N) {
            int x = X.incrementAndGet();
            K[x - 1].incrementAndGet();
            System.out.println("Sản xuất sản phẩm #" + x);
        } else {
            System.out.println("Kho đầy - ngưng sản xuất");
        }
    }

    private static void consume() {
        if (X.get() > 0) {
            int x = X.decrementAndGet();
            K[x].decrementAndGet();
            System.out.println("Tiêu thụ sản phẩm #" + x);
        } else {
            System.out.println("Kho hết hàng, tạm dừng tiêu thụ");
        }
    }
}