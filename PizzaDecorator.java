
public abstract class PizzaDecorator implements Pizza {
    protected final Pizza wrapped;

    protected PizzaDecorator(Pizza wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription();
    }

    @Override
    public double getCost() {
        return wrapped.getCost();
    }
}
