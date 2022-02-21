import java.util.Objects;

public class wrappedPieceProduct {
    private productWrap wrap;
    private pieceProduct product;
    private int quantity;

    public wrappedPieceProduct(productWrap wrap, pieceProduct product, int quantity) throws IllegalArgumentException, NullPointerException{
        if(wrap == null || product == null)
            throw new NullPointerException("Значения товара и упаковки не могут быть пустыми!");
        this.wrap = wrap;
        this.product = product;
        if(quantity <= 1)
            throw new IllegalArgumentException("В упаковке не может быть менее одного товара!");
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getNet(){
        return quantity* product.Weight;
    }
    public double getGross(){
        return getNet() + wrap.getWrapWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        wrappedPieceProduct that = (wrappedPieceProduct) o;
        return quantity == that.quantity && Objects.equals(wrap, that.wrap) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wrap, product, quantity);
    }

    @Override
    public String toString() {
        return "wrappedPieceProduct{" +
                "wrap = " + wrap +
                ", product = " + product +
                ", quantity = " + quantity +
                '}';
    }
}
