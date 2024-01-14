package ru.ivesoft.experimental.application;

import ru.ivesoft.experimental.library.SomeLibraryClass;

/**
 * The main application class. Fixed up.
 */
public class Main {
    /**
     * The main application class.
     *
     * @param args arguments of application
     */
    public static void main(String[] args) {
        new SomeLibraryClass();
        System.out.println("Input args: `" + String.join(", ", args) + "`;");
        System.out.println("OK");
    }
}
