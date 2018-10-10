package afvink3;

import java.util.Random;
import java.awt.*;

public class Paard {

    private int afstand, paardNummer;
    private static int aantal = 0;
    private String naam;
    private Image plaatje;
    Random random = new Random();

    /* Constructor voor Paard */
    Paard(String name, Image image) {
        this.naam = name;
        this.plaatje = image;
        this.afstand = 0;
        paardNummer = ++aantal;
    }

    public String getNaam() {
        return this.naam;
    }

    public int getAfstand() {
        return this.afstand;
    }

    public int getPaardNummer() {
        return paardNummer;
    }

    public Image getimage() {
        return this.plaatje;
    }

    public void run() {
        afstand = afstand + random.nextInt(20);
        System.out.println(naam + " is op positie " + afstand);
    }
}