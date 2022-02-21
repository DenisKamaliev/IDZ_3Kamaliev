import org.junit.Test;

import static org.junit.Assert.*;

public class weightProductTest {
    @Test(expected = NullPointerException.class)
    public void testProduct() {
        weightProduct Wproduct1 = new weightProduct("banana", "it is banana");
        weightProduct Wproduct2 = new weightProduct("banana", "it is banana");
        weightProduct Wproduct3 = new weightProduct("banana", "it is banananananana");
        weightProduct Wproduct4 = new weightProduct("", "");

        boolean t = Wproduct1.equals(Wproduct2);
        assertFalse(t);
        boolean z = Wproduct1.equals(Wproduct3);
        assertTrue(z);
    }

}