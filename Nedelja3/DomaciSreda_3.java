package Nedelja3;

import java.util.Scanner;

public class DomaciSreda_3 {
    public static boolean validity (String a){
        char[] ch = a.toCharArray();
        int counter = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])){
                counter++;
                break;
            }
        }
        if (a.length() > 8 && counter > 0) {
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        if (validity(password)){
            System.out.println("The password contains over 8 characters and 1 capital letter!");
        } else {
            System.out.println("The password is invalid");
            password = sc.nextLine();
        }

    }
}
