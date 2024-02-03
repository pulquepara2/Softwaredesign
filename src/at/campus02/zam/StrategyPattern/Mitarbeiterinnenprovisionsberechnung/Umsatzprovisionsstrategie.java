package at.campus02.zam.StrategyPattern.Mitarbeiterinnenprovisionsberechnung;

public class Umsatzprovisionsstrategie implements Provisionsstrategie{
    @Override
    public double berechnen(Mitarbeiterin m) {
    return m.getUmsatz()*0.05;
    }
}
