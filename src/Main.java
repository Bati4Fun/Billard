import sum.kern.Fenster;
import sum.kern.Maus;
import sum.kern.Tastatur;

public class Main {

    public Fenster fenster;
    public Tastatur tastatur;
    public Maus maus;

    public Main(){
        fenster = new Fenster(500, 500, "Billiard", true);
        Kugel kugel = new Kugel(fenster, 20, 20);
        kugel.zeichne();
        Kugel kugel2 = new Kugel(fenster, 50, 20);
        kugel2.zeichne();
        tastatur = new Tastatur();
        maus = new Maus();

        while (true){
            kugel2.bewege();
            kugel.bewege();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}