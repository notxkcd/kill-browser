package org.shahid.util;

public class Log {
    // ANSI escape code constants
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static void print(String msg, String color) {
        System.out.println(color + msg + RESET);
    }

    public static void print(String msg) {
        System.out.println(msg + RESET);
    }

    public static void main(String[] args) {
        print("Testing Mode....");
        print("Hello in RED", RED);
        print("Hello in GREEN", GREEN);
    }
}
