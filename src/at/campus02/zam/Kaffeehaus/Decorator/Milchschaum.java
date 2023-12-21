package at.campus02.zam.Kaffeehaus.Decorator;

public class Milchschaum extends ZutatDecorator {
    public Milchschaum(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", " +"Milchschaum";
    }

    public double kostet() {
        return getraenk.kostet() + 0.4;
    }
}
