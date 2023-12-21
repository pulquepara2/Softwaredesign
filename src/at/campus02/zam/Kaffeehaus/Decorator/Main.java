package at.campus02.zam.Kaffeehaus.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zum Kaffehaus startet.....");
        Getraenk g = new CafeLatte();
        g = new Milch(g);
        //g = new Milch(g);  //wir haben nocheinmal gewrappt - Der Espresso, Milch, Milch kostet: 4.1€
        g = new Sirup(g);
        g = new Zucker(g);
        g = new Milchschaum(g);
        g = new Schlag(g);  //g ist ein Schlag

        //erwarteter output: Das Getränk "Espresso,Milch" kostet: 3.3€
        System.out.println("Der "+ g.getBeschreibung()+ " kostet: " + g.kostet() + "€");


        System.out.println("Zum Kaffehaus schließt.....");
    }
}