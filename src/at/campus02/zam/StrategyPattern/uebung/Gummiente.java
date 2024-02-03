package at.campus02.zam.StrategyPattern.uebung;

public class Gummiente extends Ente{
    public Gummiente(String name) {
        super(null, name);
    }

    @Override
    public void anzeigen() {
        System.out.println("Schau dir meine Gummistiefel an!");
    }
}
