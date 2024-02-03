package at.campus02.zam.Observer.Medienverlag;

public class PrintAbonnent implements AbonnentIn {

    private String name;
    private Medienverlag medienverlag;
    public PrintAbonnent(String name_, Medienverlag medienverlag_) {
        this.name = name_;
        this.medienverlag=medienverlag_;
        System.out.println("--PrintAbonnent "+ name + " erstellt.");
        medienverlag.addSubscriber(this);//Der Konstruktor fügt den Subscriber der Arraylist hinzu
    }


    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("Printabonnent " + name + " hat einen neuen Artikel erhalten, mit dem Titel: " + artikel.getTitle());
    }

    @Override
    public String getName() {
        return name;
    }
}
