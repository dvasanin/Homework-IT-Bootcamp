package TrecaNedelja;

import java.util.ArrayList;

public class DomaciNedelja {
    public static ArrayList<Integer> dvadesetiZadatak(ArrayList<Integer> x, ArrayList<Integer> y) {
        x.addAll(y);
        return x;
    }

    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();

        ArrayList<Integer> y = new ArrayList<>();

        System.out.println(dvadesetiZadatak(x,y));
    }
}
