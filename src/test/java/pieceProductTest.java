import org.junit.Test;

import static org.junit.Assert.*;

public class pieceProductTest {
    @Test(expected = IllegalArgumentException.class)
    public void testProduct() {
        pieceProduct Pproduct1 = new pieceProduct("egg", "white egg", 0.065);
        pieceProduct Pproduct2 = new pieceProduct("egg", "white egg", 0.065);
        pieceProduct Pproduct3 = new pieceProduct("egg", "white egg", 0.066);
        pieceProduct Pproduct4 = new pieceProduct("egg", "white egg", -0.065);


        boolean t = Pproduct1.equals(Pproduct2);
        assertFalse(t);
        boolean z = Pproduct1.equals(Pproduct3);
        assertTrue(z);
    }

}