package at.campus02.zam.StrategyPattern.Mitarbeiterinnenprovisionsberechnung;

import java.util.ArrayList;

public class MitarbeiterinnenManagerin {

    ArrayList<Mitarbeiterin> Mitarbeiterinnenverwaltung = new ArrayList<>();
    Provisionsstrategie provisionsstrategie = null;
    private double summeDerProvision;

    public MitarbeiterinnenManagerin(Provisionsstrategie provisionsstrategie) {
        this.provisionsstrategie = provisionsstrategie;
    }

    public Provisionsstrategie getProvisionsstrategie() {
        return provisionsstrategie;
    }

    public void setProvisionsstrategie(Provisionsstrategie provisionsstrategie) {
        this.provisionsstrategie = provisionsstrategie;
    }

    public void add(Mitarbeiterin m) {
        Mitarbeiterinnenverwaltung.add(m);
        System.out.println("Mitarbeiterin \"" + m.getName() + "\" erfolgreich hinzugefügt");
    }

    public void berechneProvision() {
        if (provisionsstrategie == null) {
            System.out.println("Es konnte keine Provision berechnet werden.");
            return;

        }
        double summeDerProvision = 0.0d;
        for (Mitarbeiterin m : Mitarbeiterinnenverwaltung) {
            System.out.println("Berechnete Provision für Mitarbeiterin " + m.getName() + " ist: ");
            System.out.println(provisionsstrategie.berechnen(m));
            summeDerProvision = summeDerProvision +provisionsstrategie.berechnen(m);

        }
        System.out.println("Gesamtsumme aller Provisionen ist: " + summeDerProvision);
    }

    public void changeCommissionTo(Provisionsstrategie neueprovisionsstrategie) {
         provisionsstrategie = neueprovisionsstrategie;
    }
}
