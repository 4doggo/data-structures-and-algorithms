package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    Stack stack;

    @Test
    public void testBracket(){
        stack = new Stack();

        stack.push('{');
        System.out.println(stack.peek());
        stack.push('}');
        System.out.println(stack.peek());

        assertTrue(MultiBracketValidation.multiBracketValidation("{}"));

    }


}