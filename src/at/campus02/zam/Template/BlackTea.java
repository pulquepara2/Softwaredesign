package at.campus02.zam.Template;

public class BlackTea extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Steep BlackTee leaves 5 minutes");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add honey in BlackTee");
    }
}
