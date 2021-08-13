package Nedelja2;

import java.util.Scanner;

public class DomaciSreda_1 {

    public static double lessOfTwo(double x, double y) {
        if (x > y) {
            return y;
        }
        return x;
    }

    public static double lessOfThree(double x, double y, double z) {
        if (lessOfTwo(x, y) > z) {
            return z;
        } else return lessOfTwo(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter #1: ");
        double  x = sc.nextDouble();
        System.out.println("Enter #2: ");
        double y = sc.nextDouble();
        System.out.println("Enter #3: ");
        double z = sc.nextDouble();
        System.out.println();
        System.out.println("The lowest of the three is " + lessOfThree(x, y, z) + ".");
    }
}
