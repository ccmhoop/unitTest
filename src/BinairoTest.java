import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinairoTest {

//    @Test
//    void surround_one_island() {
//        assertEquals("0110", Binairo.solve(".11."));
//    }
//
//    @Test
//    void surround_zero_island() {
//        assertEquals("1001", Binairo.solve(".00."));
//    }
//
//    @Test
//    void surround_fill_in_canyon_zero() {
//        assertEquals("010", Binairo.solve("0.0"));
//    }
//
//    @Test
//    void surround_fill_in_canyon_one() {
//        assertEquals("101", Binairo.solve("1.1"));
//    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            .11...,     0110..
            .00...,     1001..
            11....,     110...
            ....11,     ...011
            00....,     001...
            ....00,     ...100
            1.1...,     101...
            0.0...,     010...
            0.0.01,     010101
            ..1011,     001011
            ..0100,     110100
            11..,       1100
            11.0.1.0.., 1100110010
            1.1..0,     101..0
            """)
    void test_solve_method(String input, String expected) {
        assertEquals(expected, Binairo.solve(input));
    }

    @Test
    void ensure_solve_rejects_uneven_board_width() {
        assertThrows(UnevenWidthException.class, () -> Binairo.solve("..."));
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            cc
            .01c
            000i
            """)
    void ensure_solve_rejects_invalid_input_characters(String input) {
        assertThrows(InvalidCharacterException.class, () -> Binairo.solve(input));
    }
}
