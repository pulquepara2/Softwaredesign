package at.campus02.zam.Observer.Medienverlag;

import java.util.ArrayList;
import java.util.List;

public class Medienverlag {

    //muss können: Abonnenten aufnehmen,veröffentlichen
    private List<AbonnentIn>abonnentIns = new ArrayList<>();
    public void veroeffentliche(Artikel artikel) {
        for(AbonnentIn a : abonnentIns){
            a.erhalte(artikel);
        }
    }

    public void addSubscriber(AbonnentIn abonnent) {
        abonnentIns.add(abonnent);
        System.out.println("-Medienverlag: added Subsriber: " + abonnent.getName());
    }

    public void removeSubscriber(AbonnentIn abonnent){
        abonnentIns.remove(abonnent);
        System.out.println("-Medienverlag: removed subscriber " + abonnent.getName());
    }
}
