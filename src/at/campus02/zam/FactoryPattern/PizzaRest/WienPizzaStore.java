package at.campus02.zam.FactoryPattern.PizzaRest;

public class WienPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("mushroom")){
            return new WienMushroomPizza();
        } else if (item.equals("veggie")) {
            return new WienVeggiePizza();

        }else{
            return null;
        }
    }
}
