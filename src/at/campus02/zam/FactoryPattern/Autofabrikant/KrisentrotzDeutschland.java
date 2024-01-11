package at.campus02.zam.FactoryPattern.Autofabrikant;

public class KrisentrotzDeutschland extends Krisentrotz {
    @Override
    protected Fahrzeug produce(Fahrzeugtyp type) {
            Fahrzeug vehicle = null;

            switch (type) {
                case PKW:
                    vehicle = new PKW();
                    break;
                case LKW:
                    vehicle = new LKW();
                    break;
                case SPORTWAGEN:
                    vehicle = new Sportwagen();
                    break;
                default:
                    vehicle=null;
                    break;
            }
        return vehicle;
    }
}