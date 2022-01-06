import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BurgerTest {

        @Test
        public void deveRetornarBurgerToppings() {
            Burger burger = new PlainBurger();
            assertEquals(burger.getToppings(), "Top and bottom bun with 200g of beef");
        }

        @Test
        public void deveRetornarBurgerPrice() {
            Burger burger = new PlainBurger();
            assertEquals( burger.getPrice(),3.50 , 0);
        }

    @Test
    public void deveRetornarCheeseBurgerToppings() {
        Burger cheeseBurger = new CheeseBurger(new PlainBurger());
        assertEquals(cheeseBurger.getToppings(), "Top and bottom bun with 200g of beef and two slices of cheese");
    }

    @Test
    public void deveRetornarCheeseBurgerPrice() {
        Burger cheeseBurger = new CheeseBurger(new PlainBurger());
        assertEquals( cheeseBurger.getPrice(),9.0 , 0);
    }

    @Test
    public void deveRetornarBaconCheeseBurgerToppings() {
        Burger baconCheeseBurger = new BaconBurger( new CheeseBurger(new PlainBurger()));
        assertEquals(baconCheeseBurger.getToppings(), "Top and bottom bun with 200g of beef and two slices of cheese and three slices of bacon");
    }

    @Test
    public void deveRetornarBaconCheeseBurgerPrice() {
        Burger baconCheeseBurger = new BaconBurger( new CheeseBurger(new PlainBurger()));
        assertEquals( baconCheeseBurger.getPrice(),16.84 , 0);
    }
}
