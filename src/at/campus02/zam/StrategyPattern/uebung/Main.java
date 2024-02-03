package at.campus02.zam.StrategyPattern.uebung;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ente> Enten = new ArrayList<>();
        Gummiente hanspeter = new Gummiente("Hans-Peter");
        Enten.add(hanspeter);
        Enten.add(new Tafelente("Schmatzofatz"));
        Enten.add(new Rotkopfente("Klaus"));

        for(Ente e: Enten){
            e.quaken();
            e.schwimmen();
            e.performfliegen();
            e.anzeigen();
        }
    }
}
