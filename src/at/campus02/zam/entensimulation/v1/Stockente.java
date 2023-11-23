package at.campus02.zam.entensimulation.v1;

public class Stockente extends Ente{


    public Stockente(String name) {
        super(name, new Flatterflugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Schau dir meinen Stock an");
    }
}
