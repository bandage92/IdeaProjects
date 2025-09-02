package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TemperatureStateTest {

    @Test
    public void testSolidState() {
        assertEquals("Solid", TemperatureState.determineState(0));
        assertEquals("Solid", TemperatureState.determineState(-10));
        assertEquals("Solid", TemperatureState.determineState(-273));
    }

    @Test
    public void testLiquidState() {
        assertEquals("Liquid", TemperatureState.determineState(1));
        assertEquals("Liquid", TemperatureState.determineState(25));
        assertEquals("Liquid", TemperatureState.determineState(99));
    }

    @Test
    public void testGasState() {
        assertEquals("Gas", TemperatureState.determineState(100));
        assertEquals("Gas", TemperatureState.determineState(150));
    }
}
