package at.campus02.zam.Kaffeehaus.Decorator.uebung;

public class Main {
    public static void main(String[] args) {
        System.out.println("Das Kaffeehaus öffnet...");
        Getraenk g = new CafeLatte();
        g = new Zucker(g);
        g= new Schlagobers(g);
        g= new Sirup(g);

        System.out.println("Das Getränk: "+ g.getBeschreibung() + " kostet: " +g.kostet() + " Euro." );

        Getraenk g2 = new Espresso();
        g2 = new Sirup(g2);
        g2 = new Milchschaum(g2);

        System.out.println("Das Getränk: "+ g2.getBeschreibung() + " kostet: " +g2.kostet() + " Euro." );
    }
}
