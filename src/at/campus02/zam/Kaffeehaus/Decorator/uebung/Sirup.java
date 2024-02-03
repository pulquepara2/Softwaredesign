package at.campus02.zam.Kaffeehaus.Decorator.uebung;

public class Sirup extends ZutatDecorator{
    public Sirup(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + 0.5;
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + " + Sirup";
    }
}
