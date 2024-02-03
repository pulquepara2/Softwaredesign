package at.campus02.zam.StrategyPattern.uebung;

public class Tafelente extends Ente{
    public Tafelente(String name) {
        super(new Flatterflugverhalten(), name);
    }

    @Override
    public void anzeigen() {
        System.out.println("Schau dir mein köstliches Fleisch an!");
    }
}
