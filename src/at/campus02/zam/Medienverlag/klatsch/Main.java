package at.campus02.zam.Medienverlag.klatsch;

public class Main {
    public static void main(String[] args) {
        Medienverlag klatsch = new Medienverlag();
        Artikel artikel1 = new Artikel("Schönheits-OP von Sissi", "Text 1");
        Artikel artikel2 = new Artikel("Titel 2", "Text 2");

        AbonnentIn Jaqueline = new PrintAbonnent("Jaqueline", klatsch);
        AbonnentIn Jacques = new PrintAbonnent("Jacques", klatsch);
        AbonnentIn Hose = new SMSAbonnent("Jose", klatsch);
        AbonnentIn Carlito = new WebAbonnent("Carlito", klatsch);


        klatsch.veroeffentliche(artikel1);
        klatsch.veroeffentliche(artikel2);


    }
}
