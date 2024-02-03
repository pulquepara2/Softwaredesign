package at.campus02.zam.Kaffeehaus.Decorator.uebung;

public class Milchschaum extends ZutatDecorator{
    public Milchschaum(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + 1;
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung()+ " + Milchschaum";
    }
}
