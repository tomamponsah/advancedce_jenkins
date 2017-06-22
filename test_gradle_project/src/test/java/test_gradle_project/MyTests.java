package test_gradle_project;

import org.junit.Test;
import static org.junit.Assert.*;
//mein voller Ernst

public class MyTests {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        Main tester = new Main(); // MyClass is tested

        // assert statements
        assertEquals("10 x 0 must be 0", 0, Main.multiply(10, 0));
        assertEquals("0 x 10 must be 0", 0, Main.multiply(0, 10));
        assertEquals("0 x 0 must be 0", 0, Main.multiply(0, 0));
    }
}