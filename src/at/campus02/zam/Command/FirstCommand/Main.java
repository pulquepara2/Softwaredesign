package at.campus02.zam.Command.FirstCommand;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        EinfacheFernbedienung fb = new EinfacheFernbedienung();

        Licht licht = new Licht();
        Kommando lk = new LichtAnkommando(licht);
        Kommando lk2 = new LichtAuskommando(licht);
        fb.setKommando(lk);
        fb.knopfGedrueckt();
        fb.setKommando(lk2);
        fb.knopfGedrueckt();
    }
}
