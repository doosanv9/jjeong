package math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SumDivisorTest {

    SumDivisor sumDivisor = new SumDivisor();

    @Test
    void testGetSumDivisor1() {
        assertEquals(0, sumDivisor.getSumDivisor(11));
    }

    @Test
    void testGetSumDiviso2() {
        assertEquals(5, sumDivisor.getSumDivisor(6));
    }

    @Test
    void testGetSumDivisor3() {
        assertEquals(21, sumDivisor.getSumDivisor(20));
    }
}