package org.example;

import org.example.Exceptions.InvalidArgumentException;
import org.example.Exceptions.InvalidOperationException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calculator = new Calculator();

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
            }

            System.out.println(result);
        }
    }
}