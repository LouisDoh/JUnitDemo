import org.junit.jupiter.api.*;
import static org.example.Utils.isPrime;
public class UtilsTest {

    @Test
    public void testRealityStillUnchanged() {
        Assertions.assertEquals(1,2/2,"Oh god...");
    }

    @Test
    public void testIsPrimeSuccess() {
        Assertions.assertTrue(isPrime(7),"7 found to NOT be prime");
        Assertions.assertTrue(isPrime(13),"13 found to NOT be prime");
        Assertions.assertTrue(isPrime(19),"19 found to NOT be prime");
    }

    @Test
    public void testIsPrimeFailure() {
        Assertions.assertFalse(isPrime(4),"4 found to be prime");
        Assertions.assertFalse(isPrime(10),"10 found to be prime");
        //Assertions.assertFalse(isPrime(1),"1 found to be prime");
    }


}
