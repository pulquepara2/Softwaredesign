package at.campus02.zam.FactoryPattern.PizzaRest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PizzaStore gStore = new GrazPizzaStore();
        PizzaStore wStore = new WienPizzaStore();

        Pizza pizza1 = gStore.orderPizza("mushroom");
        System.out.println("Ich bestellle eine "+ pizza1);
        Pizza pizza2 = wStore.orderPizza("veggie");
        System.out.println("Ich bestelle eine " + pizza2);
    }
}
