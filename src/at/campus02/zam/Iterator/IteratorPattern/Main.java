package at.campus02.zam.Iterator.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------meineListe---------");
        ArrayList<String> meineListe = new ArrayList<>();

        meineListe.add("Sammy");
        meineListe.add("Koci");
        meineListe.add("Cookie");

        for (String haustier : meineListe) {
            System.out.println(haustier);
        }
        System.out.println("----------meineListe.iterator()------------");
        Iterator<String> meinIterator = meineListe.iterator();
        while (meinIterator.hasNext()) {
            String haustier = meinIterator.next();
            System.out.println(haustier);
        }


        System.out.println("--------Fuhrpark----------");

        Fuhrpark fp = new Fuhrpark("Hansi");

        fp.addFortbewegungsmittel("Schi");
        fp.addFortbewegungsmittel("ElektroScooter");
        fp.addFortbewegungsmittel("Skateboard");

        for (String fortb : fp) {
            System.out.println(fortb);
        }
    }
}
