package org.example;

import org.example.Exceptions.InvalidArgumentException;

public class Operation {
    private int a;
    private int b;
    private String op; // Examples: +, -, *, /
    public Operation(String s) throws InvalidArgumentException
    {
        String[] parts = s.split(" ");
        if (parts.length != 3)
            throw new InvalidArgumentException();

        a = Integer.parseInt(parts[0]);
        op = parts[1];
        b = Integer.parseInt(parts[2]);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getOperation() {
        return op;
    }
}
