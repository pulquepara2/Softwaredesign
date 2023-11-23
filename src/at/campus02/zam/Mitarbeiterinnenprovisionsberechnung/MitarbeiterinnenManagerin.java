package at.campus02.zam.Mitarbeiterinnenprovisionsberechnung;

import java.util.ArrayList;

public class MitarbeiterinnenManagerin {

        ArrayList <Mitarbeiterin> Mitarbeiterinnenverwaltung = new ArrayList<>();
        Provisionsstrategie provisionsstrategie = null;

        public MitarbeiterinnenManagerin(Provisionsstrategie provisionsstrategie) {
                this.provisionsstrategie = provisionsstrategie;
        }

        public void add(Mitarbeiterin m){
                Mitarbeiterinnenverwaltung.add(m);
                System.out.println("Mitarbeiterin \""+m.getName()+"\" erfolgreich hinzugefügt" );
        }

        public void berechneProvision(){
                        if (provisionsstrategie == null) {
                                System.out.println("Es konnte keine Provision berechnet werden.");
                                return;
                        }
                        for(Mitarbeiterin m : Mitarbeiterinnenverwaltung){
                                System.out.println("Berechnete Provision für Mitarbeiterin " + m.getName()+ " ist: ");
                                System.out.println(provisionsstrategie.berechnen(m)); ;
                        }

        }
}
