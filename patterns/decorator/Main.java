package patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffewWithMilk = new Coffee();
        coffewWithMilk = new Milk(coffewWithMilk);
        System.out.println(coffewWithMilk.getDescription());

        Beverage coffee = new Coffee();
        Toppings chocolate = new Chocolate(coffee);
        Toppings whip = new Whip(chocolate);
        Milk milk = new Milk(whip);

        System.out.println(milk.getDescription());
        System.out.println(milk.getPrice());
    }
}
