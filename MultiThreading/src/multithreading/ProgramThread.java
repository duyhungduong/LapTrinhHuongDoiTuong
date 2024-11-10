
package multithreading;

import java.util.Queue;

public class ProgramThread extends Thread{
    private final Queue<Integer> queue;
    private final int maxSize;

    public ProgramThread(Queue<Integer> queue, int maxSize) {
        this.queue = queue;
        this.maxSize = maxSize;
    }
    
    // Phương thức sản xuất
    public synchronized void produce(int value) {
        while (queue.size() == maxSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Producing: " + value);
        queue.offer(value);
        notify();
    }

    // Phương thức tiêu thụ
    public synchronized int consume() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value = queue.poll();
        System.out.println("Consuming: " + value);
        notifyAll();
        return value;
    }
}
