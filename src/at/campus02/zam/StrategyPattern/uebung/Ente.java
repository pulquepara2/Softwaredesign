package at.campus02.zam.StrategyPattern.uebung;

public abstract class Ente {
    private Flugverhalten fv;
    private String name;

    public Ente(Flugverhalten fv, String name) {
        this.fv = fv;
        this.name = name;
        System.out.println("Ente "+ name + " wurde erstellt");
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
        System.out.println("Die Ente namens "+ name + " quakt." );
    }
    public void schwimmen(){
        System.out.println("Die Ente namens " + name + " schwimmt.");
    }
    public abstract void anzeigen();

    public void performfliegen(){
        if(fv!= null){
            fv.fliegen();
        }
        else{
            System.out.println("Diese Ente kann nicht fliegen");
        }
    }

}
