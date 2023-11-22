import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    private Game g;

    /*
     * JUnit annotation
     *
     * Junit4 / Junit5
     *
     * Before | BeforeEach
     * Test   | Test
     * Ignore | Disabled
     */

    private void test2(){

    }

    @Test
    void testGame(){
        g = new Game(0,10);
    }

}
