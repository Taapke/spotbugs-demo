package org.example;

// This will be caught by spotbug as an unthrown exception
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
