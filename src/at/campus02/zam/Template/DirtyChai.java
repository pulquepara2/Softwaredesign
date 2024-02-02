package at.campus02.zam.Template;

public class DirtyChai extends CaffeineBeverage{
    @Override
    protected void boilWater() {
        System.out.println("Heat tee water 100 deg C, heat espresso water 94 deg C, heat milk to max 66 deg C for DirtyChai");
    }

    @Override
    protected void brew() {
        System.out.println("Brew tee with tee water, add foamed milk, add nicely extracted espresso");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Nothing");
    }
}
