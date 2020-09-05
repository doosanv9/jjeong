package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DaysTest {
    Days cntDays = new Days();

    @Test
    void test1(){
        Assertions.assertEquals("FRI", cntDays.cntDays(1,1));
    }

    @Test
    void test2(){
        Assertions.assertEquals("MON", cntDays.cntDays(2,1));
    }
}