package at.campus02.zam.Podcast;

public class Podcast {
    private String name;
    private String URL;
    private double length;

    public Podcast(String name, String URL, double length) {
        this.name = name;
        this.URL = URL;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
