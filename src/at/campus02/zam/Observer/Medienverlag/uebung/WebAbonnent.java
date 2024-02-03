package at.campus02.zam.Observer.Medienverlag.uebung;

public class WebAbonnent implements Abonnent{
    private String name;
    private Medienverlag medienverlag;

    public WebAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        System.out.println("WebAbonnent " + name + " wurde erstellt.");
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("WebAbonnent " + name + " hat einen neuen Artikel mit dem Titel '"+ artikel.getTitle()+ "' erhalten.");
    }

    @Override
    public String getName() {
        return name;
    }
}
