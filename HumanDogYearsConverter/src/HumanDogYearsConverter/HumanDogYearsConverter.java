package HumanDogYearsConverter;

import java.util.Scanner;

public class HumanDogYearsConverter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Asking the user for their name
        System.out.println("Enter your name: ");
        String userName = keyboard.nextLine();

        System.out.println("Hello There " +userName);

        // Asking the user to enter the current year
        System.out.print("Enter the current year: ");
        int currentYear = Integer.parseInt(keyboard.nextLine());

        // Asking the user to enter their birth year
        System.out.print("Enter your birth year: ");
        int birthYear = Integer.parseInt(keyboard.nextLine());

        // Asking the user to enter their dog's birth year
        System.out.print("Enter your dog's birth year: ");
        int dogBirthYear = Integer.parseInt(keyboard.nextLine());

        int age = currentYear - birthYear;
        int dogAge = currentYear - dogBirthYear;
        int dogYearsAge = dogAge * 7;

        System.out.println("Hello " +userName);
        System.out.println("Your age is: " + age);
        System.out.println("Your Dog's age is: " + dogAge);
        System.out.println("Your Dog's age in dog years is: " + dogYearsAge);

        // Close the scanner to release resources
        keyboard.close();
    }
}
