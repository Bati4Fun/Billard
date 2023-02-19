import sum.kern.Fenster;
import sum.kern.Buntstift;

public class Kugel
{
    private final Buntstift stift;
    private final double GROESSE = 5f;
    private final double GESCHWINDIGKEIT = 0.1;
    private final Fenster fenster;

    public Kugel(Fenster fenster, int x, int y)
    {
        this.fenster = fenster;
        stift = new Buntstift(fenster);
        stift.setzeFuellMuster(1);
        stift.dreheUm(-30);
        stift.bewegeBis(x, y);
    }

    public void zeichne()
    {
        stift.normal();
        stift.zeichneKreis(GROESSE);
    }

    public void loesche()
    {
        stift.radiere();
        stift.zeichneKreis(GROESSE);
        stift.normal();
    }

    public void bewege()
    {
        testeAufKante();
        loesche();
        stift.bewegeUm(GESCHWINDIGKEIT);
        zeichne();
        fenster.zeichneDich();
    }

    private void testeAufKante(){
        if (stift.hPosition() >= 500 || stift.hPosition() <= 10){
            stift.dreheBis(180 - stift.winkel());
        }
        if (stift.vPosition() >= 500 || stift.vPosition() <= 0){
            stift.dreheBis(0 - stift.winkel());
        }
    }
}

