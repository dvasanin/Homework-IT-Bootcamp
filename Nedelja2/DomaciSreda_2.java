package Nedelja2;

import java.util.Scanner;

public class DomaciSreda_2 {

    public static int factorial(int z) {
        if (z == 0) {
            return 1;
        } else {
            return (z * factorial(z - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while (n < 0) {
            System.out.println("Error");
            n = sc.nextInt();
        }
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}