import org.junit.Test;

import static org.junit.Assert.*;

public class productTest {
    @Test(expected = NullPointerException.class)
    public void testProduct() {
        product product1 = new product("paper", "yellow");
        product product2 = new product("paper", "yellow");
        product product3 = new product("paper", "blue");
        product product4 = new product("", "");

        boolean t = product1.equals(product2);
        assertFalse(t);
        boolean z = product1.equals(product3);
        assertTrue(z);
    }
}