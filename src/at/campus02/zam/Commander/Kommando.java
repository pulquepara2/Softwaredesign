package at.campus02.zam.Commander;

// Alle Kommandos implementieren gleiches Interface
public interface Kommando {
    public void ausfuehren();
    public void undo();
}
