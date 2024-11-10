
package multithreading;

import java.util.Queue;

public class Producer extends ProgramThread{
    
    public Producer(Queue<Integer> queue, int maxSize) {
        super(queue, maxSize);
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            produce(value++);
        }
    }
    
}
