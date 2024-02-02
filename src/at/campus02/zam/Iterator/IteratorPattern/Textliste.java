package at.campus02.zam.Iterator.IteratorPattern;

import java.util.Iterator;

public class Textliste implements Iterable<String>{
    private String[] text;
    public Textliste(String t) {
        text=t.split(" ");
    }
    @Override
    public Iterator<String> iterator() {
        return new TextListeIterator(text);
    }
}
