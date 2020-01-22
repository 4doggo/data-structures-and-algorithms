package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    Queue queue;

    @Before
    public void setUp() throws Exception {

        queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(100);
        queue.enqueue(10);
        queue.enqueue(100);
        queue.enqueue(5000);

    }

    @Test
    public void testEnqueueWhenEmpty(){
        assertEquals(10,queue.peek());
    }

    @Test
    public void enqueue() {

        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(7000);
        assertEquals(7000,queue.peek());
    }

    @Test
    public void dequeue() {
        queue.dequeue();
        assertEquals(100,queue.peek());
        queue.enqueue(1000000);
        queue.enqueue(5000000);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(1000000,queue.peek());
    }

    @Test
    public void isEmpty() {
        assertFalse(queue.isEmpty());
    }
}