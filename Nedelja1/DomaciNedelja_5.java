import java.util.Scanner;

public class DomaciNedelja_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        sc.hasNextInt();
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("Error, number has to be positive: ");
            n = sc.nextInt();
        }
        int tmp = n;
        int hN = n;
        while (hN / 10 != 0) {
            hN = 0;
            while (n != 0) {
                hN += n % 10;
                n /= 10;
            }
            n = hN;
        }
        System.out.println("The number hidden behind " + tmp + " is " + hN);
    }
}