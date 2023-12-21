package at.campus02.zam.Kaffeehaus.Decorator;

public abstract class Getraenk {
    protected String beschreibung = "unbekanntes Getraenk";
    //nur abgeleiteten Klassen können zugreifen - protected

    public String getBeschreibung() {
        return beschreibung;
    }


    public abstract double kostet();
}