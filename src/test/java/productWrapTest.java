import org.junit.Test;

import static org.junit.Assert.*;


public class productWrapTest {
    @Test(expected = IllegalArgumentException.class)
    public void testWrap() {
        productWrap wrap1 = new productWrap("glass bottle", 0.2);
        productWrap wrap2 = new productWrap("paper wrap", 0.01);
        productWrap wrap3 = new productWrap("glass bottle", 0.2);
        productWrap wrap4 = new productWrap("glass bottle", 0.0);
        boolean t = wrap1.equals(wrap2);
        assertFalse(t);
        boolean z = wrap1.equals(wrap3);
        assertTrue(z);
    }


}