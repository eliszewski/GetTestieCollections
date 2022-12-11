package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertFalse(stack.isEmpty()); // false
    }
    @Test
    public void TestStack_isEmpty() {
        Stack<String> stack = new Stack<>();
        assertTrue(stack.isEmpty()); // true
    }
    // Make a bigger test exercising more Stack methods.....
}
