package Nedelja3;

import java.util.Scanner;

public class DomaciSreda_1 {
    public static String clean (String a){
        a = a.replaceAll("#", "").replaceAll("\\$", "").replaceAll("@","");
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        System.out.println(clean(msg));
    }
}
