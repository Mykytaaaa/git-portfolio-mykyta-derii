package org.example;

import org.example.Exceptions.DivisionByZeroException;
import org.example.Exceptions.InvalidOperationException;

public class Calculator {
    public int Calculate(Operation operation) throws InvalidOperationException, DivisionByZeroException
    {
        String op = operation.getOperation();
        switch (op)
        {
            case "+":
                return operation.getA() + operation.getB();
            case "-":
                return operation.getA() - operation.getB();
            case "*":
                return operation.getA() * operation.getB();
            case "/":
                if (operation.getB() == 0)
                    throw new DivisionByZeroException();
                return operation.getA() / operation.getB();
            case "%":
                return operation.getA() % operation.getB();
            default:
                throw new InvalidOperationException();
        }
    }
}
