
public class Olives extends PizzaDecorator {
    public Olives(Pizza wrapped) {
        super(wrapped);
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 1.0;
    }
}
