package at.campus02.zam.entensimulation.v1;

public class Gummiente extends Ente {


    public Gummiente(String name) {
        super(name,null);
    }

    @Override
    public void anzeigen() {
        System.out.println("Die Gummiente " + getName() + " zeigt ihre Gummistiefel");
    }
    @Override
    public void quaken(){
        System.out.println("Die Ente " + getName() + " quietscht");
    }
}
