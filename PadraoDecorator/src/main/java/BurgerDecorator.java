public class BurgerDecorator implements Burger {
    private final Burger burgerDecorator;

    public BurgerDecorator(Burger burgerDecorator) {
        this.burgerDecorator = burgerDecorator;
    }



    @Override
    public String getToppings() {
        return burgerDecorator.getToppings();
    }

    @Override
    public double getPrice() {
        return burgerDecorator.getPrice();
    }
}
