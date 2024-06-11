package org.example;

public class NullDereference {
    public static void nullDereferenceMethod() {
        String possiblyNull = getNullString();

        // This will be caught by Error Prone as a potential null dereference
        if (possiblyNull.length() > 0) {
            System.out.println("String is not empty");
        }
    }

    private static String getNullString() {
        return null;
    }
}
