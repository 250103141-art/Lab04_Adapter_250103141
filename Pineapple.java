
public class Pineapple extends PizzaDecorator {
    public Pineapple(Pizza wrapped) {
        super(wrapped);
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + ", Pineapple";
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 1.5;
    }
}
