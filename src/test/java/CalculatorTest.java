import org.junit.jupiter.api.Test;
import java.util.logging.Level;
import java.util.logging.Logger;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final static Logger LOG = Logger.getGlobal();

    public CalculatorTest(){
        LOG.setLevel(Level.INFO);
//      LOG.info(myCal.str);

    }

//    String str= "1 + 3 * 4 / 2 + 2";

    @Test
    void isNull() {
        String str = "12";
        Calculator myCal = new Calculator(str);
        assertNull(myCal.str);
    }

    @Test
    void isSpace() {
        String str = "12 + 12";
        Calculator myCal = new Calculator(str);
        assertEquals(0,myCal.strArr.length);
    }

    @Test
    void removeSpace() {
        String str = "12 + 12";
        Calculator myCal = new Calculator(str);
        for (int i = 0; i < myCal.strArr.length; i++) {
            assertFalse(myCal.strArr[i].equals(" "),"공백존재, 테스트 실패"); // False라고 단정짓는다. True면 테스트 실패
        }
    }

    @Test
    void isNum() {
        String str = "12 + 12";
        Calculator myCal = new Calculator(str);

        String testStr = "+";
        myCal.isNum(testStr);

    }

    @Test
    void isSign() {
        String str = "12 + 12";
        Calculator myCal = new Calculator(str);

        String testStr = "13";
        myCal.isSign(testStr);

    }

    @Test
    void chkStrLen() {
        String str = "12";
        Calculator myCal = new Calculator(str);
        assertEquals(Integer.parseInt(str),myCal.current);

        String str2 = "12 -10";
        Calculator myCal2 = new Calculator(str2);
        assertEquals(Integer.parseInt(str2),myCal2.current);

    }


    @Test
    void add() {
        String str = "10";
        Calculator myCal = new Calculator(str);
        myCal.add(5);
        assertEquals(myCal.current,15);
    }

    @Test
    void sub() {
        String str = "10";
        Calculator myCal = new Calculator(str);
        myCal.sub(5);
        assertEquals(myCal.current,5);
    }

    @Test
    void mul() {
        String str = "10";
        Calculator myCal = new Calculator(str);
        myCal.mul(5);
        assertEquals(myCal.current,50);
    }

    @Test
    void div() {
        String str = "10";
        Calculator myCal = new Calculator(str);
        myCal.div(5);
        assertEquals(myCal.current,2);
    }

    @Test
    void printResult() {
        String str = "10";
        Calculator myCal = new Calculator(str);
        myCal.printResult();
    }
}