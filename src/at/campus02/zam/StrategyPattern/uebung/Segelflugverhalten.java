package at.campus02.zam.StrategyPattern.uebung;

public class Segelflugverhalten implements Flugverhalten{
    @Override
    public void fliegen() {
        System.out.println("Ente segelt." );
    }
}
