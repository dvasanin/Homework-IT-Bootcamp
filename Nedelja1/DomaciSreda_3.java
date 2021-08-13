import java.util.Scanner;

public class DomaciSreda_3 {
    public static void main(String[] args) {
        //Za uneti pozitivni celobrojni cetvorocifreni broj izracunati i ispisati koji se broj dobije kada se od proizvoda njegovih prvih dveju cifara oduzme zbir drugih dveju njegovih cifara.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired number: ");
        int numberOne = sc.nextInt();
        int tmp = numberOne;
        if (numberOne >= 1000 && numberOne < 10000 || numberOne > 0) {
            int j = tmp % 10;
            tmp /= 10;
            int d = tmp % 10;
            tmp /= 10;
            int s = tmp % 10;
            tmp /= 10;
            int h = tmp % 10;
            System.out.println("Thousands (A): " + h);
            System.out.println("Hundreds (B): " + s);
            System.out.println("Tens (C): " + d);
            System.out.println("Ones (D): " + j);
            int numberTwo = (h * s) - (d + j);
            System.out.println("The result of our equitation ((A*B)-(C+D)) is: " + numberTwo);
        } else {
            System.out.println();
            System.out.println("Invalid entry!");
        }
        System.out.println();
        System.out.println("Thank you for your time, goodbye!");
    }
}