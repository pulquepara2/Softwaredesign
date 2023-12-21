package at.campus02.zam.Kaffeehaus.Decorator;

public class Schlag extends ZutatDecorator {
    public Schlag(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", " +"Schlag";
    }

    public double kostet() {
        return getraenk.kostet() + 0.6;
    }
}