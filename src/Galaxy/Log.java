package Galaxy;

import java.util.Scanner;

public class Log {

    public static void info() {
        System.out.println();
    }

    public static void info(String message) {
        System.out.println(message);
    }

    static void warning(String message) {
        System.out.println("[!] "  + message);
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void pause() {
        Scanner skan = new Scanner(System.in);
        String enter = skan.nextLine();
    }

}