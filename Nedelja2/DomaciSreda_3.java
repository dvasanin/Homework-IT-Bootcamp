package Nedelja2;

import java.util.Scanner;

public class DomaciSreda_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words 'true' or 'false'!");
        boolean b = sc.nextBoolean();
        System.out.println("Enter a number!");
        int i = sc.nextInt();
        System.out.println("Enter a double");
        double d = sc.nextDouble();
        if (b){
            bid(true,i,d);
        }
        else {
            bid(false,i,d);
        }
    }

    public static void bid(boolean b, int i, double d) {
        if (!b) {
            System.out.print("Boolean. ");
        }
        if (i > 49) {
            System.out.print("Integer. ");
        }
        if ((int)d > i * 2) {
            System.out.print("Double. ");
        }
    }
}
