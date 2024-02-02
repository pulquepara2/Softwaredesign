package at.campus02.zam.Iterator.IteratorPattern;

import java.util.Iterator;

public class TextListeIterator implements Iterator<String> {

    private String[] words;
    private int position;

    public TextListeIterator(String[] w) {
        this.words = w;
        position = 0;
    }

    public TextListeIterator() {

    }

    @Override
    public boolean hasNext() {
        if(position < words.length) {
            return true;
        }
        return false;
        //return position < words.length;
    }

    @Override
    public String next() {
        String wort = words[position];
        position++;
        return wort;
    }
}
