package org.shahid.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class KillBrowser {

    // Emoji mapping
    private static final Map<String, String> browserEmojis = new HashMap<>();

    // One professional color (cyan)
    private static final String BROWSER_COLOR = "\u001B[36m";
    private static final String RESET = "\u001B[0m";

    static {
        browserEmojis.put("chrome" , "🌐");
        browserEmojis.put("firefox", "🦊");
        browserEmojis.put("edge"   , "🤡");   // people who uses Edge are clown ... IMO
        browserEmojis.put("safari" , "🧭");
        browserEmojis.put("opera"  , "🎭");
        browserEmojis.put("brave"  , "🛡️");
    }

    /**
     * Kill all processes of the given browser.
     * Works on Linux/macOS using pkill and Windows using taskkill.
     */
    public static void kill(String browser) {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            String[] command;

            if (os.contains("win")) {
                // Windows: taskkill
                command = new String[]{"taskkill", "/F", "/IM", browser + ".exe"};
            } else {
                // Linux/macOS: pkill
                command = new String[]{"pkill", browser};
            }

            Runtime.getRuntime().exec(command);

            // Emoji + professional color
            String emoji = browserEmojis.getOrDefault(browser.toLowerCase(), "🛑");

            if (browser.equalsIgnoreCase("edge")) {
                System.out.println("All " + " " + BROWSER_COLOR + browser + RESET + " browsers are terminated. ✅");
                System.out.println("😂 Nobody asked for Edge, but we killed it anyway!");
                System.out.println("💀 RIP Edge... back to downloading Chrome.");
                System.out.println("🤔 Are you REALLY using Edge? Like... willingly?");
                System.out.println("📢 Breaking News: User found running Edge in 2025, authorities still investigating.");
            } else {
                // System.out.println("✅ All " + emoji + " " + BROWSER_COLOR + browser + RESET + " browsers are terminated.");
                System.out.println("All " + " " + BROWSER_COLOR + browser + RESET + " browsers are terminated. ✅");
            }

        } catch (IOException e) {
            System.err.println("❌ Failed to kill " + browser + " browser.");
            e.printStackTrace();
        }
    }

    /** Convenience method: kills Chrome by default */
    public static void kill() {
        kill("chrome");
    }
}
