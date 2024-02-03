package at.campus02.zam.StrategyPattern.entensimulation;

public class Flatterflugverhalten implements Flugverhalten{
    @Override
    public void fliegen() {
        System.out.println("Ente flattert.");
    }
}
