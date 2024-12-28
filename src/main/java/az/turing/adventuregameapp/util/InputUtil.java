package az.turing.adventuregameapp.util;

import java.util.Scanner;

public class InputUtil {
    public static String getString(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + " ");
        return sc.nextLine();
    }

    public static Integer getInteger(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + " ");
        return sc.nextInt();
    }
}
