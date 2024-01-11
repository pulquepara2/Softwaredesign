package at.campus02.zam.FactoryPattern.PizzaRest;

public class Pizza {
    protected String name;

    void prepare(){
        System.out.println("Pizza '" + name + "': wird vorbereitet ");
    }
    void bake(){
        System.out.println("Pizza '" + name + "': wird gebacken für 2min 30s. ");
    }
    void cut(){
        System.out.println("Pizza '" + name + "': wird geschnitten ");
    }

    void box(){
        System.out.println("Pizza '" + name + "': wird Stück für Stück in die Box gelegt, weil wir es gern umständlich machen. ");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
