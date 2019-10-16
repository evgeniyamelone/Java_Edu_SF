import java.util.Scanner;


public class CountElementsString {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Input any symbol: ");
        char c = reader.next().charAt(0);

        String text = "\nThe first two games in the series, Castle Wolfenstein and Beyond Castle Wolfenstein, were developed by Muse Software and focused on stealth-based gameplay from a top-down perspective.\nBeginning with id Software's Wolfenstein 3D, Wolfenstein games became fast-paced first-person shooters, which is widely regarded to have helped popularize the first-person shooter genre.\nFurther games in the series include Return to Castle Wolfenstein, developed by Gray Matter Interactive, Wolfenstein: Enemy Territory by Splash Damage, and 2009's Wolfenstein by Raven Software.\nAfter ZeniMax Media acquired id Software, including the Wolfenstein franchise, Swedish developer MachineGames became the series' primary developer.\nWolfenstein games developed by MachineGames include Wolfenstein: The New Order, Wolfenstein: The Old Blood, Wolfenstein II: The New Colossus, Wolfenstein: Youngblood, and Wolfenstein: Cyberpilot.";
        System.out.println("\nHere's our text: ");
        System.out.println(text);
        System.out.println("\nCount of symbol '"+c + "' : " + countElement(text, c));
    }

    public static int countElement(String str, char s) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                count++;
            }
        }
        return count;
    }
}
