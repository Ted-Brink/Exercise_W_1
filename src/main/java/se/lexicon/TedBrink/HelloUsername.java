package se.lexicon.TedBrink;
import java.util.Scanner;

// Har inte förstått övningen

public class HelloUsername {
    public static void main(String[] args) {
        String userName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ditt namn? ");
        userName = scan.nextLine();
        System.out.println("Hej " + userName + "!");

    }
}

