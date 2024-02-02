package at.campus02.zam.Iterator.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fuhrpark implements Iterable<String>{
    private String besitzer;
    private List<String> fortbewegungsmittel;

    public Fuhrpark(String besitzer) {
        this.besitzer = besitzer;
        this.fortbewegungsmittel = new ArrayList<>();
    }

    public void addFortbewegungsmittel(String f){
        this.fortbewegungsmittel.add(f);
    }

    //muss uns einen iterator zurückliefer der es uns ermöglicht über die forbewegungsmittel zu iterieren
    @Override
    public Iterator<String> iterator() {
        //bekommt Bezug zu den Daten
        return new FuhrparkIterator(this.fortbewegungsmittel);
    }
}
