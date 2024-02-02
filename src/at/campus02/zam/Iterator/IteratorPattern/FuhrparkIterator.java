package at.campus02.zam.Iterator.IteratorPattern;

import java.util.Iterator;
import java.util.List;

public class FuhrparkIterator implements Iterator<String> {
    private List<String> fb;
    private int position;

    public FuhrparkIterator(List<String> fb) {
        this.fb = fb;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position < fb.size()) { //gibts noch element in der liste?
            return true;
        }
        return false;

    }

    @Override
    public String next() {
        String nextObj = fb.get(position);
        position++;
        return nextObj;
    }
}
