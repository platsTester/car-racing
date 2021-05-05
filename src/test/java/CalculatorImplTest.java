import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorImplTest {

    @Test
    void chkNull() {

        CalculatorImpl cal = new CalculatorImpl(null);
    }

    @Test
    void chkSpace() {

        CalculatorImpl cal = new CalculatorImpl(" ");
    }

}