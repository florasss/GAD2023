package patterns.decorator;

public abstract class Toppings implements Beverage{
    private  Beverage beverage;
    public Topping(Beverage beverage) {
        this.beverage = beverage;
    }

    public Integer getPrice() {
        return beverage.getPrice() + this.getPrice();
    }

    public  String getDescription(){
        return beverage.getDescription();
    }
}
