package at.campus02.zam.Iterator.IteratorPattern;

public class Main2 {
    public static void main(String[] args) {
        Textliste tl = new Textliste("Hansi geht Schi fahren");

        for (String w : tl) {
            System.out.println(w);
        }
    }
}
