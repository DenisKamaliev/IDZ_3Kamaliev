import org.junit.Test;

import static org.junit.Assert.*;

public class wrappedSetProductsTest {
    @Test()
    public void test1(){
        productWrap wrap1 = new productWrap("paper wrap", 1.);
        pieceProduct Pproduct1 = new pieceProduct("egg", "white egg", 1.);
        wrappedPieceProduct wrappedPieceProduct1 = new wrappedPieceProduct ("Name","Description",wrap1, Pproduct1, 3);
        productWrap wrap2 = new productWrap("glass bottle", 1.);
        weightProduct Wproduct1 = new weightProduct("banana", "it is banana");
        wrappedWeightProduct wrappedWeightProduct1 = new wrappedWeightProduct("Name","Description",wrap2, Wproduct1, 1.);
        wrappedSetProducts PrSet = new wrappedSetProducts("Name","Description",wrap1, wrappedWeightProduct1);
        productWrap wrap3 = new productWrap("box", 1.);
        wrappedSetProducts PrSet1 = new wrappedSetProducts("Name","Description",wrap3, wrappedPieceProduct1, PrSet );
        wrappedSetProducts PrSet2 = new wrappedSetProducts("Name","Description",wrap2, wrappedPieceProduct1, PrSet );
        wrappedSetProducts PrSet3 = new wrappedSetProducts("Name","Description",wrap3, wrappedPieceProduct1, PrSet );
        assertFalse(PrSet1.equals(PrSet2));
        assertTrue(PrSet1.equals(PrSet3));
        assertEquals(8., PrSet1.getGross(), 0.01);

    }
    @Test(expected = NullPointerException.class)
    public void test2(){
        productWrap wrap1 = new productWrap("paper wrap", 0.1);
        pieceProduct Pproduct1 = new pieceProduct("egg", "white egg", 0.065);
        wrappedPieceProduct wrappedPieceProduct1 = new wrappedPieceProduct ("Name","Description",wrap1, Pproduct1, 3);
        productWrap wrap2 = new productWrap("glass bottle", 0.2);
        weightProduct Wproduct1 = null;
        wrappedWeightProduct wrappedWeightProduct1 = new wrappedWeightProduct("Name","Description",wrap2, Wproduct1, 2.0);
        productWrap wrap3 = new productWrap("box", 0.05);
        wrappedSetProducts PrSet1 = new wrappedSetProducts("Name","Description",wrap3, wrappedPieceProduct1, wrappedWeightProduct1 );

    }
    @Test(expected = IllegalArgumentException.class)
    public void test3(){
        productWrap wrap1 = new productWrap("paper wrap", 0.1);
        pieceProduct Pproduct1 = new pieceProduct("egg", "white egg", 0.065);
        wrappedPieceProduct wrappedPieceProduct1 = new wrappedPieceProduct ("Name","Description",wrap1, Pproduct1, 3);
        productWrap wrap2 = new productWrap("glass bottle", 0.2);
        weightProduct Wproduct1 = new weightProduct("banana", "it is banana");
        wrappedWeightProduct wrappedWeightProduct1 = new wrappedWeightProduct("Name","Description",wrap2, Wproduct1, 2.0);
        productWrap wrap3 = new productWrap("box", 0.05);
        wrappedSetProducts PrSet1 = new wrappedSetProducts("Name","Description",wrap3, wrap1, wrappedWeightProduct1 );


    }
    @Test()
    public void test4() {


    }


}