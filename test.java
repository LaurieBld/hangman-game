import java.util.Scanner;

public class test {

    private static String[] words = { "r o b o t" };
    private static String word = words[(int) (Math.random() * words.length)];
    private static String dash = new String(new char[word.length() / 2]).replace("\0", "_ ");
    private static int count = 0;

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Go deviner mtn");
        while (count < 5 && dash.contains("_")) {
            System.out.println(dash);
            final String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(final String guess) {
        String newDash = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newDash += guess.charAt(0);
            } else if (dash.charAt(i) != '_') {
                newDash += word.charAt(i);
            } else {
                newDash += "_";
            }
        }

        if (dash.equals(newDash)) {
            count++;
            image();
        } else {
            dash = newDash;
        }
        if (dash.equals(word)) {
            System.out.println("Bravo");
            System.out.println(word);
        }
    }

    public static void image() {
        if (count == 1) {
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 2) {
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (count == 3) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 4) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("Alors?");
            final Scanner sc = new Scanner(System.in);
            final String hint = sc.nextLine();
            if (hint.equals("yes"))
                System.out.println("");
        }

        if (count == 5) {
            System.out.println("Désolée");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! Le mot était " + word);
        }

    }

}