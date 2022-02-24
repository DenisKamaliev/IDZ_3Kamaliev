import org.junit.Test;

import static org.junit.Assert.*;

public class productServiceTest {
    @Test
    public void test(){
        productWrap wrap = new productWrap("wrap", 1.);
        pieceProduct x = new pieceProduct("Chars 'x'", "paper char 'x'", 0.01);
        pieceProduct y = new pieceProduct("Chars 'y'", "paper char 'y'", 0.01);
        pieceProduct chair = new pieceProduct("Chairs", "woody chair", 4.);
        wrappedPieceProduct Pproduct1 = new wrappedPieceProduct("Paper product", "x", wrap, x,1000);
        wrappedPieceProduct Pproduct2 = new wrappedPieceProduct("Paper product", "y",wrap, y,500);
        wrappedPieceProduct Pproduct3 = new wrappedPieceProduct("Woody product", "red wood", wrap, chair, 10);
        shipmentProducts shPr = new shipmentProducts("Partiya", "Vsyakogo", Pproduct1, Pproduct2,Pproduct3 );
        BeginStringFilter filter = new BeginStringFilter("Paper");
        productService pr = new productService();
        assertEquals(2, pr.countByFilter(shPr, filter) );
    }

}