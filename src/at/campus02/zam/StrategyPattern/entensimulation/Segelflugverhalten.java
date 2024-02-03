package at.campus02.zam.StrategyPattern.entensimulation;

public class Segelflugverhalten implements Flugverhalten{
    @Override
    public void fliegen() {
        System.out.println("Ente segelt");
    }
}
