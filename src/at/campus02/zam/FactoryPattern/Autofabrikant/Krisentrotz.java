package at.campus02.zam.FactoryPattern.Autofabrikant;

public abstract class Krisentrotz {
    public Krisentrotz() {
    }
    abstract protected Fahrzeug produce(Fahrzeugtyp type);

    public Fahrzeug orderVehicle(Fahrzeugtyp type){
        Fahrzeug fahrzeug = produce(type);
        fahrzeug.hupen();
        fahrzeug.waschen();
        return fahrzeug;
    }

}
