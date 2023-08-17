package delivery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.BIKE, 0) < 0);
    }

    @Test
    public void shouldReturn200ForBikeAndDistanceIs20Km() {
        int price = priceCalculator.calculatePrice(TransportType.BIKE, 20);
        Assertions.assertEquals(200, price);
    }

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs21Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.BIKE, 21) < 0);
    }

    @Test
    public void shouldReturn7000ForCarAndDistanceIs1000Km() {
        int price = priceCalculator.calculatePrice(TransportType.CAR, 1000);
        Assertions.assertEquals(7000, price);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.CAR, 0) < 0);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs1001Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.CAR, 1001) < 0);
    }

    @Test
    public void shouldReturn10000ForTruckAndDistanceIs2000Km() {
        int price = priceCalculator.calculatePrice(TransportType.TRUCK, 2000);
        Assertions.assertEquals(10000, price);
    }

    @Test
    public void shouldBeNegativeWhenTruckAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.TRUCK, 0) < 0);
    }

    @Test
    public void shouldBeNullWhenDrone() {
        Assertions.assertNull(priceCalculator.calculatePrice(TransportType.DRONE, 0));
    }

}
