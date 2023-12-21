package at.campus02.zam.Medienverlag.klatsch;

public class SMSAbonnent implements AbonnentIn {

    private String name;
    private Medienverlag medienverlag;
    public SMSAbonnent(String name_, Medienverlag medienverlag_) {
        this.name = name_;
        this.medienverlag=medienverlag_;
        System.out.println("--PrintAbonnent "+ name + " erstellt.");
        medienverlag.addSubscriber(this);//Der Konstruktor fügt den Subscriber der Arraylist hinzu
    }


    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("SMSAbonnent " + name + " hat einen neuen Artikel (per SMS) erhalten, mit dem Titel: " + artikel.getTitle());
    }

    @Override
    public String getName() {
        return name;
    }
}
