import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaredTest {

    Squared squared = new Squared();

    @Test
    void test1(){
        Assertions.assertEquals(144, squared.getSquared(121));
    }

    @Test
    void test2(){
        Assertions.assertEquals(-1, squared.getSquared(3));
    }
}