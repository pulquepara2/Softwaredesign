package at.campus02.zam.Template;

public class CocoaExtra extends CaffeineBeverage{

    @Override
    protected void boilWater() {
        System.out.println("Heat milch to max 66 deg C");
    }

    @Override
    protected void brew() {
        System.out.println("Mix milk with organic coca powder");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add pocket coffee to Cacao");
    }
}


