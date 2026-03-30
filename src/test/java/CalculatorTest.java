import org.example.Exceptions.InvalidArgumentException;
import org.example.Operation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    @Test
    public void calculator_1_add_3_returns_4() throws InvalidArgumentException {
        var calculator = new Calculator();
        var op = new Operation("1 + 3");
        assertEquals(calculator.Calculate(op), 4);
    }

    @Test
    public void calculator_5_minus_8_returns_minus_3() throws InvalidArgumentException {
        var calculator = new Calculator();
        var op = new Operation("5 - 8");
        assertEquals(calculator.Calculate(op), -3);
    }
}
