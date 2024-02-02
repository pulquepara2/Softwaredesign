package at.campus02.zam.Template;

public abstract class CaffeineBeverage {
    //template methode - cant be overwritten
    //provides our skeleton of our algorithm
    final void prepareRecipe(){
        //steps that cant be changed by subclasses - können nicht verändert werden
        boilWater();
        brew();
        pourIn();
        addCondiments();
    }

    protected void boilWater(){
        System.out.println("Boil water 100 deg C");
    }

    protected abstract void brew();

    protected void pourIn(){
        System.out.println("Pour into our favourite cup");
    }

    protected abstract void addCondiments();
}


