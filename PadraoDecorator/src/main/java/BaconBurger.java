public class BaconBurger extends  BurgerDecorator {

    public BaconBurger(Burger burgerDecorator) {
        super(burgerDecorator);
    }




    @Override
    public String getToppings() {
        return super.getToppings() + " and three slices of bacon";
    }


    @Override
    public double getPrice(){
        return super.getPrice() + 7.84;
    }
}
