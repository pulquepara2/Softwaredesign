package at.campus02.zam.Command.FirstCommand;

public class LichtAnkommando implements Kommando{
    private Licht licht;
    public LichtAnkommando(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausfuehren() {
        licht.an();
    }
}
