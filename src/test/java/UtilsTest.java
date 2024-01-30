import org.junit.jupiter.api.*;
import static org.example.Utils.isPrime;
public class UtilsTest {

    @Test
    public void testRealityStillUnchanged() {
        Assertions.assertEquals(1,2/2,"Oh god...");
    }

    @Test
    public void testIsPrimeTrues() {
        Assertions.assertTrue(isPrime(7), "7 found not to be prime");
        Assertions.assertTrue(isPrime(13),"13 found not to be prime");
        Assertions.assertTrue(isPrime(2),"2 found not to be prime");
    }

    @Test
    public void testIsPrimeFalses() {
        Assertions.assertFalse(isPrime(10), "10 found to be prime");
        Assertions.assertFalse(isPrime(8),"8 found to be prime");
        Assertions.assertFalse(isPrime(1), "1 found to be prime");
    }

}
