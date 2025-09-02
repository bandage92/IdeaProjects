package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IPAddressValidatorTest {

    @Test
    public void testValidIPs() {
        assertEquals("Valid IP", IPAddressValidator.validateIP("192.168.254.1"));
        assertEquals("Valid IP", IPAddressValidator.validateIP("172.16.254.1"));
        assertEquals("Valid IP", IPAddressValidator.validateIP("127.0.0.1"));
        assertEquals("Valid IP", IPAddressValidator.validateIP("0.0.0.0"));
        assertEquals("Valid IP", IPAddressValidator.validateIP("255.255.255.255"));
    }

    @Test
    public void testInvalidOctets() {
        assertEquals("Invalid IP", IPAddressValidator.validateIP("256.1.2.3"));
        assertEquals("Invalid IP", IPAddressValidator.validateIP("1.256.2.3"));
        assertEquals("Invalid IP", IPAddressValidator.validateIP("1.2.256.3"));
        assertEquals("Invalid IP", IPAddressValidator.validateIP("1.2.3.256"));
    }

    @Test
    public void testNegativeOctets() {
        assertEquals("Invalid IP", IPAddressValidator.validateIP("-1.2.3.4"));
        assertEquals("Invalid IP", IPAddressValidator.validateIP("1.-2.3.4"));
        assertEquals("Invalid IP", IPAddressValidator.validateIP("1.2.-3.4"));
        assertEquals("Invalid IP", IPAddressValidator.validateIP("1.2.3.-4"));
    }
}
