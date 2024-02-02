package at.campus02.zam.Template;

public class ChaiLatte extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Brew tea with water, then add warm milk");
    }

    @Override
    protected void boilWater() {
        System.out.println("Heat a bit of water 100 deg C, heat milk max 66 deg C for ChaiLatte");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Sugar if needed");
    }
}
