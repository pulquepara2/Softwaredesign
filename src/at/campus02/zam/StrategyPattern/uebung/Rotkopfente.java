package at.campus02.zam.StrategyPattern.uebung;

public class Rotkopfente extends Ente{
    public Rotkopfente(String name) {
        super(new Segelflugverhalten(), name);
    }

    @Override
    public void anzeigen() {
        System.out.println("Schau dir meinen roten Kopf an!");
    }
}
