import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz f;

    @BeforeEach
    void fizzBuzzTest() {
        f = new FizzBuzz();
    }

    @Test
    public void testNumber() {
        assertEquals("1", f.getResults(1));
    }

    @Test
    public void testFizz() {
        assertEquals("fizz", f.getResults(3));
    }

    @Test
    public void testBuzz() {
        assertEquals("buzz", f.getResults(5));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("fizzbuzz", f.getResults(15));
    }

    @Test
    public void testLoop() {
        for (int i = 1; i < 101; i++) {
            System.out.println(f.getResults(i));
        }
    }
}
