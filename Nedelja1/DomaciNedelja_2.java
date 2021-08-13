import java.util.Scanner;

public class DomaciNedelja_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("The number you have entered is invalid or 0, enter a positive number: ");
            n = sc.nextInt();
        }
        int countfizzbuzz = 0;
        for (int i = 0; i < n; i++) {
            String msg = (i + 1) + ": ";
            countfizzbuzz += 1;
            if (countfizzbuzz % 3 == 0) {
                msg += "Fizz";
            }
            if (countfizzbuzz % 5 == 0) {
                msg += "Buzz";
            }
            if (countfizzbuzz % 7 ==0){
                msg +="Zazz";
            }
            System.out.println(msg);
        }
    }
}