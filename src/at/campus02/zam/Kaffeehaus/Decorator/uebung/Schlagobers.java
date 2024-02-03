package at.campus02.zam.Kaffeehaus.Decorator.uebung;

public class Schlagobers extends ZutatDecorator {

    public Schlagobers(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + 0.70;
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + " + Schlagobers";
    }
}
