package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GcdTest {

    Gcd gcd = new Gcd();
    int[] ret = new int[2];

    @Test
    void testParameter() {
        ret[0] = 0;
        ret[1] = 0;
        Assertions.assertArrayEquals(ret, gcd.getGcd(10000,10001));
    }

    @Test
    void testGetGcd_1_6(){
        ret[0] = 1;
        ret[1] = 6;
        Assertions.assertArrayEquals(ret, gcd.getGcd(2,3));
    }

    @Test
    void testGetGcd_3_12(){
        ret[0] = 3;
        ret[1] = 12;
        Assertions.assertArrayEquals(ret, gcd.getGcd(3,12));
    }
    @Test
    void testGetGcd_6_12(){
        ret[0] = 6;
        ret[1] = 12;
        Assertions.assertArrayEquals(ret, gcd.getGcd(6,12));

    }

    @Test
    void testGetGcd_100_2400(){
        ret[0] = 100;
        ret[1] = 2400;
        Assertions.assertArrayEquals(ret, gcd.getGcd(300,800));
    }
}