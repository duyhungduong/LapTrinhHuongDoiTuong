
package multithreading;

import java.util.Queue;

public class Consumer extends ProgramThread{
    
    public Consumer(Queue<Integer> queue, int maxSize) {
        super(queue, maxSize);
    }

    @Override
    public void run() {
        while (true){
            consume();
        }
    }
    
    
}
