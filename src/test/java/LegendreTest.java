import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegendreTest {

    @Test
    void test() {
        assertEquals(1, Legendre.polynomial(0, 2));
        assertEquals(2, Legendre.polynomial(1, 2));
        assertEquals(5.5, Legendre.polynomial(2,2));
        assertEquals(321, Legendre.polynomial(4,3));
    }

}