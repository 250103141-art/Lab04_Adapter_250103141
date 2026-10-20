// Concrete Decorator: adds Cheese (+$2.0)
public class Cheese extends PizzaDecorator {
    public Cheese(Pizza wrapped) {
        super(wrapped);
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 2.0;
    }
}
