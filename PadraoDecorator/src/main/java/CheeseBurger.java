public class CheeseBurger extends BurgerDecorator{

    public CheeseBurger(Burger burgerDecorator) {
        super(burgerDecorator);
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " and two slices of cheese";
    }


    @Override
    public double getPrice(){
        return super.getPrice() + 5.50;
    }
}
