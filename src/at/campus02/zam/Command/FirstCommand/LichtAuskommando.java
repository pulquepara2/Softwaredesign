package at.campus02.zam.Command.FirstCommand;

public class LichtAuskommando implements Kommando {
    private Licht licht;
    public LichtAuskommando(Licht licht) {
        this.licht = licht;
    }


    @Override
    public void ausfuehren() {
        licht.aus();
    }
}
