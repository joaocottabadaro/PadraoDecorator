public class PlainBurger implements  Burger{
    @Override
    public String getToppings() {
        return "Top and bottom bun with 200g of beef";
    }

    @Override
    public double getPrice() {
        return 3.50;
    }
}
