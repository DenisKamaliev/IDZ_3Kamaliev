import org.junit.Test;

import static org.junit.Assert.*;

public class shipmentProductsTest {
    @Test()
    public void test1(){
        productWrap wrap1 = new productWrap("paper wrap", 1.);
        pieceProduct Pproduct1 = new pieceProduct("egg", "white egg", 1.);
        wrappedPieceProduct wrappedPieceProduct1 = new wrappedPieceProduct ("Name","Description",wrap1, Pproduct1, 3);
        productWrap wrap2 = new productWrap("glass bottle", 1.);
        weightProduct Wproduct1 = new weightProduct("banana", "it is banana");
        wrappedWeightProduct wrappedWeightProduct1 = new wrappedWeightProduct("Name","Description",wrap2, Wproduct1, 1.);
        wrappedPieceProduct wrappedPieceProduct2 = new wrappedPieceProduct ("Name","Description",wrap1, Pproduct1, 2);
        shipmentProducts shPr1 = new shipmentProducts("Tovar","Anything", wrappedPieceProduct1, wrappedWeightProduct1);
        shipmentProducts shPr2 = new shipmentProducts("Tovar","Anything", wrappedPieceProduct1, wrappedWeightProduct1);
        shipmentProducts shPr3 = new shipmentProducts("Tovar","Anything", wrappedPieceProduct2, wrappedWeightProduct1);

        assertFalse(shPr1.equals(shPr3));
        assertTrue(shPr1.equals(shPr2));
        assertEquals(6., shPr1.getMass(), 0.01);
    }
    @Test(expected = NullPointerException.class)
    public  void test2(){
        wrappedPieceProduct wrappedPieceProduct1 = null;
        shipmentProducts shPr1 = new shipmentProducts("Tovar","Anything", wrappedPieceProduct1);
    }
    @Test(expected = IllegalArgumentException.class)
    public  void test3(){
        product cucumber = new product("cucumber", "it is green");
        shipmentProducts shPr1 = new shipmentProducts("Tovar","Anything", cucumber);
    }


}