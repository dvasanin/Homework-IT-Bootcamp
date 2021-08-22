package Domaci.Nedelja4.Nedelja;

import java.util.ArrayList;

public class Posta {
    private ArrayList<Poruka> poruke;

    public Posta(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }

    public ArrayList<Poruka> getPoruke() {
        return poruke;
    }

    public void setPoruke(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }

    public void add(Poruka p) {
        for (int i = 0; i < poruke.size(); i++) {
            if (poruke.get(i).getId() == p.getId()) {
                return;
            }
        }
        poruke.add(p);
    }

    public void remove(Poruka p) {
        for (int i = 0; i < poruke.size(); i++) {
            if (poruke.get(i).getId() == p.getId()) {
                poruke.remove(p);
            }
        }
    }

    public void send(Poruka p) {
        System.out.println(p);
        remove(p);
    }

    public void change(Poruka p, String msg) {
        p.setPoruka(msg);
    }

    public int isplata(Poruka p) {
        int sumaZaIsplatu = 0;
        for (int i = 0; i < poruke.size(); i++) {
            if (poruke.get(i).getPoruka().equals(p.getPoruka())) {
                sumaZaIsplatu = p.getSuma();
                break;
            }
        }
        return sumaZaIsplatu;
    }

    @Override
    public String toString() {
        String s = "";
        for (Poruka poruka : poruke) {
            if (isplata(poruka) > 0) {
                s = s.concat(poruka.getPosiljalac() + " salje " + isplata(poruka) + " para " + poruka.getPrimalac() + "-u, uz poruku:" + "\n" + poruka.getPoruka() + "\n");
            } else {
                s = s.concat(poruka.getPosiljalac() + " prima " + Math.abs(isplata(poruka)) + " para " + poruka.getPrimalac() + "-u, uz poruku:" + "\n" + poruka.getPoruka() + "\n");
            }
        }
        return s;
    }
}