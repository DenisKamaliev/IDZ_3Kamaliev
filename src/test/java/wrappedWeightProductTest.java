import org.junit.Test;

import static org.junit.Assert.*;

public class wrappedWeightProductTest {
    @Test(expected = IllegalArgumentException.class)
    public void testWrappedWeightProduct() {
        productWrap wrap1 = new productWrap("glass bottle", 0.2);
        productWrap wrap2 = new productWrap("paper wrap", 0.01);
        productWrap wrap3 = new productWrap("glass bottle", 0.2);
        weightProduct Wproduct1 = new weightProduct("banana", "it is banana");
        weightProduct Wproduct2 = new weightProduct("banana", "it is banana");
        weightProduct Wproduct3 = new weightProduct("banana", "it is banananananana");
        wrappedWeightProduct wrappedWeightProduct1;
        wrappedWeightProduct1 = new wrappedWeightProduct(wrap1, Wproduct1, 2.0);
        wrappedWeightProduct wrappedWeightProduct2 = new wrappedWeightProduct(wrap1, Wproduct1, 2.0);
        wrappedWeightProduct wrappedWeightProduct3 = new wrappedWeightProduct(wrap3, Wproduct1, 2.0);
        wrappedWeightProduct wrappedWeightProduct4 = new wrappedWeightProduct(wrap2, Wproduct3, 2.0);
        wrappedWeightProduct wrappedWeightProduct5 = new wrappedWeightProduct(wrap1, Wproduct1, 0.0);
        assertTrue(wrappedWeightProduct1.equals(wrappedWeightProduct3));
        assertFalse(wrappedWeightProduct1.equals(wrappedWeightProduct4));

    }

}
