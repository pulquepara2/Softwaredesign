package at.campus02.zam.entensimulation.v1;

public class Rotkopfente extends Ente{


    public Rotkopfente(String name) {
        super(name, new Segelflugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Schau dir meinen roten Kopf an!");
    }

}
