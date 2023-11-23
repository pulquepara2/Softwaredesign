package at.campus02.zam.Mitarbeiterinnenprovisionsberechnung;

public class Mitarbeiterin {
    private String name;
    private double Umsatz;
    private double Gewinn;

    public Mitarbeiterin(String name, double umsatz, double gewinn) {
        this.name = name;
        Umsatz = umsatz;
        Gewinn = gewinn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUmsatz() {
        return Umsatz;
    }

    public void setUmsatz(double umsatz) {
        Umsatz = umsatz;
    }

    public double getGewinn() {
        return Gewinn;
    }

    public void setGewinn(double gewinn) {
        Gewinn = gewinn;
    }
}
