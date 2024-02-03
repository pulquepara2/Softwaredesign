package at.campus02.zam.Observer.Medienverlag.uebung;

public class Main {
    public static void main(String[] args) {
        Medienverlag klatsch = new Medienverlag();
        Artikel artikel1 = new Artikel("Das ist Assingers Ende", "bla1");
        Artikel artikel2 = new Artikel("Clint Eastwood lebt jetzt in der Steiermark", "bla2");

        PrintAbonnent Anna = new PrintAbonnent("Hansi", klatsch);
        WebAbonnent Hiasl = new WebAbonnent("Hiasl", klatsch);
        SMSAbonnent Clara = new SMSAbonnent("Clara",klatsch);

        klatsch.veroeffentliche(artikel1);
        klatsch.veroeffentliche(artikel2);
    }
}
