package Nedelja3;

import java.util.Scanner;

public class DomaciSreda_2 {
    public static String removal(String a) {
        String[] curses = {"#$%^", "!@#$!!!@#"};
        String[] decurses = {"pite", "moroncinu"};
        a = a.replaceAll("#\\$%\\^", "pite").replaceAll("!@#\\$!!!@#", "moroncinu");
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String badWords = sc.nextLine();
        System.out.println(removal(badWords));
    }
}
