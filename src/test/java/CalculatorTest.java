import org.example.Calculator;
import org.example.Exceptions.InvalidArgumentException;
import org.example.Exceptions.InvalidOperationException;
import org.example.Operation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    @Test
    public void calculator_1_add_3_returns_4() throws InvalidArgumentException, InvalidOperationException {
        var calculator = new Calculator();
        var op = new Operation("1 + 3");
        assertEquals(calculator.Calculate(op), 4);
    }

    @Test
    public void calculator_5_minus_8_returns_minus_3() throws InvalidArgumentException, InvalidOperationException {
        var calculator = new Calculator();
        var op = new Operation("5 - 8");
        assertEquals(calculator.Calculate(op), -3);
    }

    @Test
    public void calculator_2_mul_3_returns_6() throws InvalidArgumentException, InvalidOperationException {
        var calculator = new Calculator();
        var op = new Operation("2 * 3");
        assertEquals(calculator.Calculate(op), 6);
    }

    @Test
    public void calculator_9_div_4_returns_2() throws InvalidArgumentException, InvalidOperationException {
        var calculator = new Calculator();
        var op = new Operation("9 / 4");
        assertEquals(calculator.Calculate(op), 2);
    }
}
