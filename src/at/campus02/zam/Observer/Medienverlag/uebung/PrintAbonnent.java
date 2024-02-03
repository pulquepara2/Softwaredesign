package at.campus02.zam.Observer.Medienverlag.uebung;

import at.campus02.zam.Observer.Medienverlag.AbonnentIn;

public class PrintAbonnent implements Abonnent {
private String name;
private Medienverlag medienverlag;

    public PrintAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        System.out.println("PrintAbonnent "+ name + " wurde erstellt");
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("Printabonnent "+ name + " hat einen neuen Artikel mit dem Titel: '"+ artikel.getTitle()+ "' erhalten");
    }

    @Override
    public String getName() {
        return name;
    }
}
