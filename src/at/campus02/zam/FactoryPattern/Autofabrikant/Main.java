package at.campus02.zam.FactoryPattern.Autofabrikant;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo Autofreunde!");
        Krisentrotz dFabrik = new KrisentrotzDeutschland();
        Krisentrotz eFabrik = new KrisentrotzEngland();

        System.out.println("Hey, I want to order 1 PKW");
        Fahrzeug f1 = dFabrik.orderVehicle(Fahrzeugtyp.PKW);

        System.out.println("Hey, I want to order 1 LKW");
        Fahrzeug f2 = eFabrik.orderVehicle(Fahrzeugtyp.LKW);

        System.out.println("Hey, I want to order 1 Sportwagen");
        Fahrzeug f3 = dFabrik.orderVehicle(Fahrzeugtyp.SPORTWAGEN);
    }
}
