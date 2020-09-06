package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarusseTest {

    Alarusse alarusse = new Alarusse();

    @Test
    void multiple1() {
        assertEquals(6, alarusse.multiple(2, 3));
    }

    @Test
    void multiple2() {
        assertEquals(100, alarusse.multiple(10, 10));
    }

    @Test
    void multiple3() {
        assertEquals(1665, alarusse.multiple(45, 37));
    }


}