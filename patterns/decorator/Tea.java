package patterns.decorator;

public class Tea implements Beverage {
    @Override
    String getDescription() { return "Coffee"; }

    @Override
    Integer getPrice() { return 10; }
    }
}
