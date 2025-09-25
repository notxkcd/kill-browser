package org.shahid.util;

public class Log {
    // ANSI escape code constants
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";


    // -------------------- SUBLIME INK COLOR ----------------------------------------
    // Reds
    public static final String RED1 = "\u001B[31m";    // #FF0000 (standard red)
    public static final String RED2 = "\u001B[35m";    // #FF007F (magenta-ish, mapped to magenta)

    // Greens
    public static final String GREEN1 = "\u001B[32m";  // #9CF828 (lime green, mapped to green)
    public static final String GREEN2 = "\u001B[32m";  // #87F025 (bright green, same as green)
    public static final String GREEN3 = "\u001B[92m";  // #A7EC21 (bright yellow-green, mapped to bright green)

    // Blues
    public static final String BLUE1 = "\u001B[34m";   // #38BDFF (blue)
    public static final String BLUE2 = "\u001B[94m";   // #79ABFF (bright blue)
    public static final String BLUE3 = "\u001B[94m";   // #BED6FF (bright blue, same)

    // Yellow
    public static final String YELLOW1 = "\u001B[33m"; // #F7C527 (yellow)

    // Lights (whites and grays)
    public static final String LIGHT1 = "\u001B[97m";  // #FFFFFF (bright white)
    public static final String LIGHT2 = "\u001B[37m";  // #EDEDED (white)
    public static final String LIGHT3 = "\u001B[37m";  // #F9FAF4 (white)
    public static final String LIGHT4 = "\u001B[37m";  // #D9D9D9 (white)
    public static final String LIGHT5 = "\u001B[37m";  // #D8D8D8 (white)
    public static final String LIGHT6 = "\u001B[37m";  // #CFCFCF (white)

    // Darks (blacks and grays)
    public static final String DARK1 = "\u001B[30m";   // #000000 (black)
    public static final String DARK2 = "\u001B[90m";   // #191919 (bright black)
    public static final String DARK3 = "\u001B[90m";   // #222220 (bright black)
    public static final String DARK4 = "\u001B[90m";   // #414C3B (bright black)
    public static final String DARK5 = "\u001B[90m";   // #666666 (bright black)

    // Muted
    public static final String MUTED1 = "\u001B[90m";  // #BFA4A4 (bright black / gray)
    // -------------------- SUBLIME INK COLOR ----------------------------------------



    public static void print(String msg, final String color) {
        System.out.println(color + msg + RESET);
    }

    public static void print(String msg) {
        System.out.println(msg + RESET);
    }


    // public static void print(String msg, String color) {
    //     if (color == null || color.isEmpty()) {
    //         System.err.println("Give a proper Color Name:\n Example \"GREEN\"");
    //     }
    //     else{
    //         String capColor  = color.toUpperCase();
    //         System.out.println(capColor + msg + RESET);
    //     }
    // }

    public static void main(String[] args) {
        print("Testing Mode....");
        print("Hello in RED", RED);
        print("Hello in GREEN", GREEN);
        print("Broskie", Log.BLUE);
    }
}
