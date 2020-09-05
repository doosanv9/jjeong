package programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {

    Compare compare = new Compare();

    @Test
    void comparePyLower1() {
        assertTrue(compare.compareCp("ppoooYY"));
    }

    @Test
    void comparePyLower2() {
        assertFalse(compare.compareCp("apooYmY"));
    }

    @Test
    void comparePyUpper1() {

        assertTrue( compare.compareCp("pPoooyY"));
    }

    @Test
    void comparePyUpper2() {

        assertFalse(compare.compareCp("YPooimp"));
    }
}