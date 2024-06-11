package org.example;

public class UnthrownException {
    public static void unthrownExceptionMethod() {
        try {
            int result = 1 / 1; // No exception here
        } catch (ArithmeticException e) {
            // This block will never be executed
            System.out.println("Caught an ArithmeticException");
        }
    }
}
