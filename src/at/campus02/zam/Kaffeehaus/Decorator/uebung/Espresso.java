package at.campus02.zam.Kaffeehaus.Decorator.uebung;

public class Espresso extends Getraenk{

    public Espresso() {
        beschreibung = "Espresso";
    }

    @Override
    public double kostet() {
        return 1.60;
    }
}
