package patterns.decorator;

public class Milk extends Toppings{
    public Milk(Beverage beverage) {super(beverage);}

    public String getDescription() {
        return super.getDescription() + "White Whip";}

    public Integer getPrice() {
        return super.getPrice() + 3;
    }

}
