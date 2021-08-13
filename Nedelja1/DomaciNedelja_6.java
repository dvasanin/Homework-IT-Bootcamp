import java.util.Scanner;
public class DomaciNedelja_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many layers would you like the triangle to have? ");
        int number = sc.nextInt();
        String star = "* ";
        String space = " ";
        String triangle = "";
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                triangle += space;
            }
            for (int j = 0; j < i + 1; j++) {
                triangle += star;
            }
            System.out.println(triangle);
            triangle = "";
        }
    }
}
