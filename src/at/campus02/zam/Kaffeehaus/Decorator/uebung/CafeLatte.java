package at.campus02.zam.Kaffeehaus.Decorator.uebung;

public class CafeLatte extends Getraenk{
    public CafeLatte() {
        beschreibung = "Cafe Latte";
    }

    @Override
    public double kostet() {
        return 3.30;
    }
}
