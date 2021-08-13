import java.util.Scanner;

public class DomaciSreda_1 {
    public static void main(String[] args) {
        //Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim redovima zbir, razliku, proizvod, kolicnik i ostatak deljenja prvog broja drugim tim redom.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numberOne = sc.nextInt();
        System.out.println("Enter the second number");
        int numberTwo = sc.nextInt();
        int numberThree = numberOne + numberTwo;
        System.out.println();
        System.out.println("Addition result: " + numberThree + ".");
        numberThree = numberOne - numberTwo;
        System.out.println("Substraction result: " + numberThree + ".");
        numberThree = numberOne * numberTwo;
        System.out.println("Multiplication result: " + numberThree + ".");
        numberThree = numberOne / numberTwo;
        System.out.println("Division result: " + numberThree + ".");
        numberThree = numberOne % numberTwo;
        System.out.println("The division remainder between these two numbers is: " + numberThree + ".");
        System.out.println();
        System.out.println("Thank you for your time, goodbye!");
    }
}