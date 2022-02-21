import org.junit.Test;

import static org.junit.Assert.*;

public class wrappedPieceProductTest {
    @Test(expected = IllegalArgumentException.class)
    public void testWrappedWeightProduct() {
        productWrap wrap1 = new productWrap("glass bottle", 0.2);
        productWrap wrap2 = new productWrap("paper wrap", -0.01);
        productWrap wrap3 = new productWrap("glass bottle", 0.2);
        pieceProduct Pproduct1 = new pieceProduct("egg", "white egg", 0.065);
        pieceProduct Pproduct2 = new pieceProduct("egg", "white egg", -0.065);
        pieceProduct Pproduct3 = new pieceProduct("egg", "white egg", 0.066);
        wrappedPieceProduct wrappedPieceProduct1 = new wrappedPieceProduct (wrap1, Pproduct1, 3);
        wrappedPieceProduct wrappedPieceProduct2 = new wrappedPieceProduct (wrap3, Pproduct1, 3);
        wrappedPieceProduct wrappedPieceProduct3 = new wrappedPieceProduct (wrap1, Pproduct3, 3);
        wrappedPieceProduct wrappedPieceProduct4 = new wrappedPieceProduct (wrap2, Pproduct2, 3);
        assertTrue(wrappedPieceProduct1.equals(wrappedPieceProduct2));
        assertFalse(wrappedPieceProduct1.equals(wrappedPieceProduct3));


    }

}