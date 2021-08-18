package Domaci.Nedelja4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Karatista {

    private String ime;
    private int godine;
    private String rang;
    private String[] kata;

    public Karatista(String ime, int godine, String rang, String[] kata) {
        this.ime = ime;
        this.rang = rang;
        Rang(rang);
        if (godine <= 0) {
            System.out.println(ime + ": Nije validan unos godine za ovog karatistu. Godine postavljene na 1");
            this.godine = 1;
        } else this.godine = godine;
        this.kata = kata;

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        if (godine <= 0) {
            System.out.println(ime + ": Nije validan unos godine za ovog karatistu. Godine nisu promenjene!");
            return;
        }
        this.godine = godine;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
        Rang(rang);
    }

    public String[] getKata() {
        return kata;
    }

    public void setKata(String[] kata) {
        this.kata = kata;
    }

    public void log() {
        System.out.println("Karatistia: " + ime + ", " + godine + ", " + rang + " - zna naredne kate " + Arrays.toString(kata));
    }

    private void Rang(String rang) {
        int kyuNum = 0;
        if (Character.isDigit(rang.charAt(1))) {
            kyuNum = 1;
        }
        int i = Integer.parseInt(rang.substring(0, kyuNum + 1));
        if (!Character.isDigit(rang.charAt(0)) || i > 10 || i < 1) {
            System.out.println("Rang nije validan za karatistu: " + ime + ". Rang je postavljen na 3Kyu");
            this.rang = "3Kyu";
            return;
        }
        if (!rang.substring(kyuNum + 1).equals("Kyu") && !rang.substring(kyuNum + 1).equals("Dan")) {
            System.out.println("Rang nije validan za karatistu: " + ime + ". Rang je postavljen na 3Kyu");
            this.rang = "3Kyu";
        }
    }

    public void napadni(int index) {
        System.out.println("Karatista " + ime + " napada sa " + kata[index] + " katom");
    }

    public void vatreniNapad() {
        System.out.println("Karatista " + ime + " napada sa " + kata[ThreadLocalRandom.current().nextInt(0, kata.length)] + " katom");
    }
}

