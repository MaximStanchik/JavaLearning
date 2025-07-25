package org.Stanchik.Lombok;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingExample {

    public void performAction() {
        log.info("Начало выполнения действия.");

        try {
            // Пример кода, который может вызвать ошибку
            int result = 10 / 0; // Это вызовет ArithmeticException
            log.info("Результат: {}", result);
        } catch (ArithmeticException e) {
            log.error("Произошла ошибка: {}", e.getMessage());
        }

        log.info("Завершение выполнения действия.");
    }

    public static void main(String[] args) {
        LoggingExample example = new LoggingExample();
        example.performAction();
    }
}
