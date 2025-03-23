package org.Stanchik.Example_3;

public class EmailValidator {
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Некорректный адрес электронной почты");
        }
    }
    public static void main(String[] args) {
        try {
            validateEmail("example.com");
        }
        catch (InvalidEmailException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
