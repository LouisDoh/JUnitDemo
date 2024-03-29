import org.junit.jupiter.api.*;
import static org.example.Utils.*;
import java.util.Random;

import static org.example.Utils.somethingRandom;
public class UtilsTest {

    @Test
    public void testRealityStillUnchanged() {
        Assertions.assertEquals(1,2/2,"Oh god...");
    }

    @Test
    public void testIsPrimeTrue() {
        Assertions.assertTrue(isPrime(2), "2 found not to be prime");
        Assertions.assertTrue(isPrime(7), "7 found not to be prime");
        Assertions.assertTrue(isPrime(17), "17 found not to be prime");
    }

    @Test
    public void testIsPrimeFalse() {
        Assertions.assertFalse(isPrime(6), "6 found to be prime");
        Assertions.assertFalse(isPrime(10), "10 found to be prime");
    }
}
