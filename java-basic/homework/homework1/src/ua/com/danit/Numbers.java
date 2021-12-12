package ua.com.danit;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber, enterNumber;
        System.out.println("Enter your name!");
        String name = scanner.nextLine();
        while (true) {
            System.out.println("Let the game begin!");
            randomNumber = random.nextInt(100);
            enterNumber = scanner.nextInt();
            while (true) {
                if (randomNumber == enterNumber) {
                    System.out.printf("Congratulations, %s%n", name);
                    break;
                } else if (enterNumber < randomNumber) {
                    System.out.println("Your number is too small. Please, try again.");
                    enterNumber = scanner.nextInt();
                } else if (enterNumber > randomNumber) {
                    System.out.println("Your number is too big. Please, try again.");
                    enterNumber = scanner.nextInt();
                }
            }
        }
    }
}
