package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack stack;

    @Before
    public void setUp() throws Exception {

        stack = new Stack();
        stack.push(1000);
        stack.push(2000);
    }


    @Test
    public void push() {

        stack.push(3000);
        assertEquals(3000,stack.peek());
    }

    @Test
    public void pop() {
//        System.out.println(stack.peek());
        stack.pop();
        assertEquals(1000,stack.peek());
        stack.pop();
        stack.push(1);
        assertEquals(1,stack.peek());
    }

    @Test
    public void isEmpty() {
        assertFalse(stack.isEmpty());
    }
}