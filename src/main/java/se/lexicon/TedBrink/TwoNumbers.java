package se.lexicon.TedBrink;

import java.util.Scanner;
// Efer dagens lektion förmodar jag att meningen med övningen var att
// Man skulle skapa olika metoder för de olika räknesätten.
// Får ordna detta senare


public class TwoNumbers {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Tal 1? ");
        num1 = scan.nextDouble();
        System.out.print("Tal 2? ");
        num2 = scan.nextDouble();
        System.out.println("Adddition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraktion: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplikation: " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
    }
}