import java.util.Scanner;

public class DomaciNedelja_1 {
    public static void main(String[] args) {
        //Uneti imena timova
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter team #1: ");
        String team1 = sc.nextLine();
        System.out.print("Enter team #2: ");
        String team2 = sc.nextLine();
        System.out.println();
        System.out.println("Let's see who is better: " + team1 + " or " + team2 + " ?");
        System.out.println();
        //Nabrojati medalje
        int team1Gold = 0;
        int team2Gold = 0;
        int team1Silver = 0;
        int team2Silver = 0;
        int team1Bronze = 0;
        int team2Bronze = 0;
        System.out.print("Gold medals of first team: ");
        team1Gold = sc.nextInt();
        System.out.print("Silver medals of first team: ");
        team1Silver = sc.nextInt();
        System.out.print("Bronze medals of first team: ");
        team1Bronze = sc.nextInt();
        System.out.print("Gold medals of second team: ");
        team2Gold = sc.nextInt();
        System.out.print("Silver medals of second team: ");
        team2Silver = sc.nextInt();
        System.out.print("Bronze medals of second team: ");
        team2Bronze = sc.nextInt();

        //Zbir medalja
        int totalMedals1 = team1Bronze + team1Silver + team1Gold;
        int totalMedals2 = team2Bronze + team2Silver + team2Gold;
        String team1win = team1 + " won!";
        String team2win = team2 + " won!";

        //Broj pojedinacnih medalja
        if (totalMedals1 > totalMedals2) {
            System.out.println(team1win);
            System.out.println("Team " + team1 + " had more medals overall.");
        } else if (totalMedals2 > totalMedals1) {
            System.out.println(team2win);
            System.out.println("Team " + team2 + " had more medals overall.");
        } else {
            if (team1Gold > team2Gold) {
                System.out.println(team1win);
                System.out.println("Team " + team1 + " had more gold medals.");
            } else if (team2Gold > team1Gold) {
                System.out.println(team2win);
                System.out.println("Team " + team2 + " had more gold medals.");
            } else {
                if (team1Silver > team2Silver) {
                    System.out.println(team1win);
                    System.out.println("Team " + team1 + " had more silver medals.");
                } else if (team2Silver > team1Silver) {
                    System.out.println(team2win);
                    System.out.println("Team " + team2 + " had more silver medals.");
                } else {
                    if (team1Bronze > team2Bronze) {
                        System.out.println(team1win);
                        System.out.println("Team " + team1 + " had more bronze medals.");
                    } else {
                        System.out.println("It's a complete tie!");
                    }
                }
            }
        }
    }
}