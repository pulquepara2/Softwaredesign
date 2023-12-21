package at.campus02.zam.Kaffeehaus.Decorator;


public class Milch extends ZutatDecorator {
    public Milch(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", " +"Milch";
    }

    public double kostet() {
        return getraenk.kostet() + 0.8;
    }
}