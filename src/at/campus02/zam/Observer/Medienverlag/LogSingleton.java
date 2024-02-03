package at.campus02.zam.Observer.Medienverlag;

public class LogSingleton {

    private static LogSingleton instance = null; //static bedeutet, dass sie immer augerufen werden kann, auch wenn die Klasse nicht existiert. zum Beispiel Math
    private LogSingleton(){ //Klasse, die einen privaten Konstruktor hat

    }
    public static LogSingleton getInstance(){
        if(instance == null){
            System.out.println("LogSingleton: erstelle mich neu, Das ist nämlich mein erster Aufruf");
            instance = new LogSingleton(); //eine neue, einzige Instanz wird erstellt
        }
        else{
            System.out.println("LogSingleton: das ist nicht der erste Zugriff, gebe Instanz zurück.");
        }
        return instance;

    }
    public void log(String text){
        System.out.println("Logging: " + text);
    }
}
