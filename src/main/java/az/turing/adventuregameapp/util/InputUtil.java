package az.turing.adventuregameapp.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String title) {
        System.out.print(title + " ");
        return scanner.nextLine();
    }

    public static Integer getInteger(String title) {
        while (true) {
            System.out.print(title + " ");
            try {
                return scanner.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Invalid input,enter a integer value!");
                scanner.nextLine();
            }
        }
    }
}
