import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTEST {
    @Test
    public void sumTest(){
        Assertions.assertEquals(calculator.calculate('+', 15, 14), 29);
    }

    @Test
    public void subTest(){
        Assertions.assertEquals(calculator.calculate('-', 15, 14), 1);
    }

    @Test
    public void mulTest(){
        Assertions.assertEquals(calculator.calculate('*', 15, 2), 30);
    }

    @Test
    public void divTest(){
        Assertions.assertEquals(calculator.calculate('/', 15, 5), 3);
    }

    @Test
    public void powTest(){
        Assertions.assertEquals(calculator.calculate('^', 2, 5), 32);
    }
}
