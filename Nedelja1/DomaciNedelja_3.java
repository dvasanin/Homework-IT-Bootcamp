import java.util.Scanner;

public class DomaciNedelja_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first item: ");
        double itemPrice = sc.nextDouble();
        double itemNumber = 0;
        double totalPrice = 0;

        while (itemPrice != 0) {
            if (itemPrice > 0) {
                totalPrice += itemPrice;
                itemNumber++;
            }
            System.out.println("Enter item price: ");
            itemPrice = sc.nextDouble();
        }
            double avgPrice = totalPrice / itemNumber;
            System.out.print("Your bill comes out to: " + totalPrice + ". " + "The average cost of your items is: " + avgPrice);
    }
}