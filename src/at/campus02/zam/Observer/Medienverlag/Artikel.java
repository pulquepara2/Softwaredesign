package at.campus02.zam.Observer.Medienverlag;

public class Artikel {
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public Artikel(String title, String content) {
        this.title = title;
        this.content = content;
      //  LogSingleton.getInstance().log("Neuer Artikel erstellt: " + title);
    }
}
