package at.campus02.zam.StrategyPattern.uebung;

public class Flatterflugverhalten implements Flugverhalten{
    @Override
    public void fliegen() {
        System.out.println("Ente flattert.");
    }
}
