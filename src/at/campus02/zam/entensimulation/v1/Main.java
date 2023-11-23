package at.campus02.zam.entensimulation.v1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ente> Entenhausen = new ArrayList<>();
        Rotkopfente peter = new Rotkopfente("Peter");
        Stockente hansi = new Stockente("Hansi");
        Entenhausen.add(new Gummiente("KingKong"));
        Entenhausen.add(peter);
        Entenhausen.add(hansi);

        for (Ente e:Entenhausen) {
            e.quaken();
            e.schwimmen();
            e.perfomfliegen();
            e.anzeigen();
        }
    }
}
