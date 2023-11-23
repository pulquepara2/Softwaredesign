package at.campus02.zam.entensimulation.v1;

public abstract class Ente {
    private String name;
    private Flugverhalten fv; //

    public Ente(String name, Flugverhalten fv) {
        this.name = name;
        this.fv = fv;
        System.out.println("Ente mit dem Namen "+ name+ " wurde erstellt");
    }

    public Flugverhalten getFv() {
        return fv;
    }

    public void setFv(Flugverhalten fv) {
        this.fv = fv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void quaken(){
        System.out.println("Die Ente namens " + name + " quakt ");
    }
    public void schwimmen(){
        System.out.println("Die Ente namens "+ name + " schwimmt ");
    }
    public void perfomfliegen() {
        if (fv != null){
            fv.fliegen();
        }else {
            System.out.println("Diese Ente kann nicht fliegen weil flugverhalten == null");
        }
    }
    public abstract void anzeigen();
}
