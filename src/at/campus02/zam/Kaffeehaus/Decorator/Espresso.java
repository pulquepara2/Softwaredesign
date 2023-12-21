package at.campus02.zam.Kaffeehaus.Decorator;

public class Espresso extends Getraenk {
    public Espresso() {
        beschreibung = "Espresso";
    }

    @Override
    public double kostet() {
        return 2.5;
    }
}