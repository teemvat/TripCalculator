import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {

    @Test
    void calculateTripCost() {
        double kilometers = 100;
        double fuelCost = 1.5;
        double fuelConsumption = 5.0;

        double expected = 7.5;
        double actual = TripCostCalculator.calculateTripCost(kilometers, fuelCost, fuelConsumption);

        assertEquals(expected, actual);
    }

    @Test
    @Disabled
    void main() {
        // Not testing main method
    }
}