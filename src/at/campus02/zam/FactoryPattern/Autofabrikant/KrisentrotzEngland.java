package at.campus02.zam.FactoryPattern.Autofabrikant;

public class KrisentrotzEngland extends Krisentrotz{
    @Override
    protected Fahrzeug produce(Fahrzeugtyp type) {
        Fahrzeug fahrzeug = null;

        switch (type){
            case LKW:
                fahrzeug = new LKW();
                break;
            default:
                fahrzeug = null;
                break;
        }
        return fahrzeug;
    }
}
