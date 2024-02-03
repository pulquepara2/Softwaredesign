package at.campus02.zam.Kaffeehaus.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zam Kaffehaus startet.....");
        Getraenk g = new CafeLatte();
        g = new Milch(g);
        g = new Sirup(g);
        g = new Zucker(g);
        g = new Milchschaum(g);
        g = new Schlag(g);

        //erwarteter output: Das Getränk "Espresso,Milch" kostet: 3.3€
        System.out.println("Der "+ g.getBeschreibung()+ " kostet: " + g.kostet() + "€");


        System.out.println("Zam Kaffehaus schließt.....");
    }
}