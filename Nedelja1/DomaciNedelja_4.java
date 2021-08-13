import java.util.Scanner;

public class DomaciNedelja_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting year:");
        int year1 = sc.nextInt(); //Starting year
        System.out.println("Enter the ending year: ");
        int year2 = sc.nextInt(); //Ending year
        int counter = 0;//Year counter

        while (year1 <= 0 || year2 <= 0) {
            if (year1 <= 0) {
                System.out.println("Error, enter again!");
                year1 = sc.nextInt();
            }
            if (year1 <= 0 || year2 <= 0) {
                System.out.println("Error, enter again 2!");
                year2 = sc.nextInt();
            }
        }
        for (int i = year1; i <= year2; i++) {
            if ((i % 4 == 0) && (i % 100 != 0 || i % 400 == 0)) {
                counter++;
            }
        }
        System.out.println("The number of leap yeaars between years " + year1 + " and " + year2 + " is " + counter + ".");
    }
}