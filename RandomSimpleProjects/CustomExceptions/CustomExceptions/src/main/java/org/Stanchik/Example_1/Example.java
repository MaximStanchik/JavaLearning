package org.Stanchik.Example_1;

import org.Stanchik.Example_1.AnotherException;
import org.Stanchik.Example_1.InvalidInputException;

public class Example {
    public static void main(String[] args) {
        try {
            validateInput(null);
        }
        catch (InvalidInputException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        catch (AnotherException e) {
            System.out.println("Another exception!!!");
        }
    };

    public static void validateInput(String input) throws InvalidInputException, AnotherException {
        if (input == null) {
            throw new AnotherException();
        }
        else if (input.isEmpty()) {
            throw new InvalidInputException("Input cannot be null or empty!");
        }
    }
};
