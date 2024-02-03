package at.campus02.zam.Observer.Medienverlag.uebung;

public interface Abonnent {
    public void erhalte(Artikel artikel);
    public String getName();
}
