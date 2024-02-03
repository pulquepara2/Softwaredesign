package at.campus02.zam.Observer.Medienverlag.uebung;

public class SMSAbonnent implements Abonnent{
    private String name;
    private Medienverlag medienverlag;

    public SMSAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        System.out.println("SMSAbonnent "+ name + "wurde erstellt.");
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("SMSAbonnent "+ name + " hat einen neuen Artikel mit dem Titel '" + artikel.getTitle()+"' erhalten");
    }

    @Override
    public String getName() {
        return name;
    }
}
