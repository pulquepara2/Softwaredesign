package at.campus02.zam.Observer.Medienverlag.uebung;

import java.util.ArrayList;
import java.util.List;


public class Medienverlag {
    public Medienverlag() {
    }
    private List<Abonnent> abonnentList = new ArrayList<>();
    public void veroeffentliche(Artikel artikel){
        for(Abonnent a : abonnentList){
            a.erhalte(artikel);
        }
    }

    public void addSubscriber(Abonnent abonnent){
        abonnentList.add(abonnent);
        System.out.println("Neuer Abonnent " + abonnent.getName()+ " wurde hinzugefügt");
    }

    public void removeSubscriber(Abonnent abonnent){
        abonnentList.remove(abonnent);
        System.out.println("Abonnent " + abonnent.getName() + " wurde aus der Liste entfernt. ");
    }
}
