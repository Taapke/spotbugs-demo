package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        if (args.length == 0 || args[0] != null) {
            new IllegalArgumentException();
        }
//        throw new RuntimeException("This exception is thrown but not gaught or handled");
//
        StringComparison.compareStrings();
        UnthrownException.unthrownExceptionMethod();
        NullDereference.nullDereferenceMethod();

    }
}