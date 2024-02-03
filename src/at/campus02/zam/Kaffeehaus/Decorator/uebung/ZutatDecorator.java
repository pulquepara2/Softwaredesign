package at.campus02.zam.Kaffeehaus.Decorator.uebung;

public abstract class ZutatDecorator extends Getraenk {
    protected Getraenk getraenk;

    public abstract String getBeschreibung();

    public ZutatDecorator(Getraenk getraenk) {
        this.getraenk = getraenk;
    }
}

