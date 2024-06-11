package org.example;

public class StringComparison {
    public static void compareStrings() {
        String a = new String("test");
        String b = new String("test");

        // This will be caught by Error Prone
        if (a == b) {
            System.out.println("Strings are the same");
        } else {
            System.out.println("Strings are different");
        }
    }
}
