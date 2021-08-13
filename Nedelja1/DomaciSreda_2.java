import java.util.Scanner;

public class DomaciSreda_2 {
    public static void main(String[] args) {
        //Na standardni ulaz se unose dva cela broja. Na standardnom izlazu ispisati da li su ta dva broja istog, odnosno suprotnog znaka, u formatu kao sto je prikazan na test primerima
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numberOne = sc.nextInt();
        System.out.println("Enter the second number");
        int numberTwo = sc.nextInt();
        System.out.println();
        if (numberOne > 0 && numberTwo > 0 || numberOne < 0 && numberTwo < 0) {
            System.out.println("Both numbers are of the same type, either positive or negative.");
        } else if (numberOne > 0 && numberTwo < 0 || numberOne < 0 && numberTwo > 0) {
            System.out.println("The numbers are two different types");
        } else {
            System.out.println("One of the numbers you have entered is invalid. Try again!");
        }
        System.out.println();
        System.out.println("Thank you for your time, goodbye!");
    }
}