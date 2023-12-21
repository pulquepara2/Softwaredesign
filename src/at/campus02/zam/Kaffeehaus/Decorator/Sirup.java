package at.campus02.zam.Kaffeehaus.Decorator;

public class Sirup extends ZutatDecorator {
    public Sirup(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", " +"Sirup";
    }

    public double kostet() {
        return getraenk.kostet() + 0.5;
    }
}