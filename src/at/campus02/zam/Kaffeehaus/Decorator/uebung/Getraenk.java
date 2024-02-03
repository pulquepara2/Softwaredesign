package at.campus02.zam.Kaffeehaus.Decorator.uebung;

public abstract class Getraenk {
    protected String beschreibung;

    public String getBeschreibung() {
        return beschreibung;
    }

    public abstract double kostet();
}
