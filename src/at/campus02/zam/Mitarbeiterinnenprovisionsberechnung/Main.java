package at.campus02.zam.Mitarbeiterinnenprovisionsberechnung;

public class Main {
    public static void main(String[] args) {
        MitarbeiterinnenManagerin MaM = new MitarbeiterinnenManagerin(new GewinnProvisionsstrategie());
        Mitarbeiterin a1 = new Mitarbeiterin("Petra", 1250.50, 850.54);
        Mitarbeiterin a2 = new Mitarbeiterin("Belinda", 84555.74, 6288.21);
        Mitarbeiterin a3 = new Mitarbeiterin("Karen", 5600, 120.51);
        MaM.add(a1);
        MaM.add(a2);
        MaM.add(a3);
        MaM.berechneProvision();
        MaM.changeCommissionTo(new Umsatzprovisionsstrategie());
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
        MaM.berechneProvision();
    }
}
