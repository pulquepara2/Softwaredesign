package at.campus02.zam.Observer.Medienverlag.uebung;

public class Artikel {
    private String title;
    private String content;

    public Artikel(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }
}
