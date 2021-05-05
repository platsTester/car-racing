import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorImplTest {

    String testStr="1 3 4";

    @Test
    void chkInit() {
        CalculatorImpl cal = new CalculatorImpl(testStr);
    }

    @Test
    void chkNull() {

        CalculatorImpl cal = new CalculatorImpl(null);
    }

    @Test
    void chkSpace() {

        CalculatorImpl cal = new CalculatorImpl(" ");
    }


    @Test
    void showAll() {
        CalculatorImpl cal = new CalculatorImpl(testStr);
        System.out.println(cal.showAll());
    }

}