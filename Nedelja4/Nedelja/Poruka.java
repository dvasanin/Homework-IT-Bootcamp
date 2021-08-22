package Domaci.Nedelja4.Nedelja;

public class Poruka {
    private String poruka;
    private String posiljalac;
    private String primalac;
    int suma;
    int id;

    public Poruka(String poruka, String posiljalac, String primalac, int suma, int id) {
        this.poruka = poruka;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.suma = suma;
        this.id = id;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public String getPosiljalac() {
        return posiljalac;
    }

    public String getPrimalac() {
        return primalac;
    }

    public int getSuma() {
        return suma;
    }

    public int getId() {
        return id;
    }

    public void posalji() {
        if (suma > 0) {
            System.out.println(this.posiljalac + " salje " + this.suma + " para " + this.primalac + "-u, uz poruku:" + " \n" + this.poruka);
        } else {
            System.out.println(this.posiljalac + " prima " + Math.abs(this.suma) + " para od " + this.primalac + "-u, uz poruku:" + " \n" + this.poruka);
        }
    }

    @Override
    public String toString() {
        return posiljalac + " i " + primalac + " vrse transakciju od " + Math.abs(suma) + ", uz poruku: " + poruka + " (" + id + ")";
    }
}