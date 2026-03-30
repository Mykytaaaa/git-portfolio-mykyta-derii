package org.example;

import org.example.Exceptions.DivisionByZeroException;
import org.example.Exceptions.InvalidArgumentException;
import org.example.Exceptions.InvalidOperationException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Hi! With this program, you can calculate integers by typing operations in format: 2 * 5.");
        System.out.println("The supported operations are: +, -, *, /, %.");

        while (true) {
            String input = in.nextLine();

            if (input.equals("exit"))
                return;

            Operation operation;
            try {
                operation = new Operation(input);
            } catch (InvalidArgumentException ex) {
                System.out.println("Invalid input format");
                continue;
            }

            int result;
            try {
                result = calculator.Calculate(operation);
            } catch (InvalidOperationException ex) {
                System.out.println("Unsupported operation");
                continue;
            } catch (DivisionByZeroException ex) {
                System.out.println("Cannot divide by zero");
                continue;
            }

            System.out.println(result);
        }
    }
}