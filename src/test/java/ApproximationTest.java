import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApproximationTest {

    @Test
    void approx() {
        double delta = Math.abs(Configuration.function(2) - Approximation.approx(2));
        assertTrue(delta < 0.00001);
    }
}