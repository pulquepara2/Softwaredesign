package at.campus02.zam.FactoryPattern.Autofabrikant;

public class Fahrzeug {
    protected String name;
    void hupen(){
        System.out.println("Honk Honk");
    }
    void waschen(){
        System.out.println("Your "+ name + " is being washed");
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "name='" + name + '\'' +
                '}';
    }
}
