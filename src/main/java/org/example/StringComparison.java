package org.example;

public class StringComparison {
    public static void compareStrings() {
        // This will be caught by spotbug as an inefficient new String(String) constructor (medium)
        String a = new String("test");
        String b = new String("test");

        // This will be caught by spotbug as comparison of String objects using == or != (medium)
        if (a == b) {
            System.out.println("Strings are the same");
        } else {
            System.out.println("Strings are different");
        }
    }
}
