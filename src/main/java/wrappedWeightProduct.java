import java.util.Objects;

public class wrappedWeightProduct extends product{
  private  productWrap wrap;
  private  weightProduct product;
  private  double weight;

    public wrappedWeightProduct( String Name, String Description, productWrap wrap, weightProduct product, double weight)throws IllegalArgumentException, NullPointerException{
        super(Name, Description);
        if(wrap == null || product == null)
            throw new NullPointerException("Значения товара и упаковки не могут быть пустыми!");
        this.wrap = wrap;
        this.product = product;
        if(weight <= 0.0)
            throw new IllegalArgumentException("Вес товара должен быть больше нуля!");
        this.weight = weight;
    }
  public double getNet(){
      return weight;
  }
  public double getGross(){
      return weight + wrap.getWrapWeight();
  }

    public productWrap getWrap() {
        return wrap;
    }

    public weightProduct getProduct() {
        return product;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        wrappedWeightProduct that = (wrappedWeightProduct) o;
        return Double.compare(that.weight, weight) == 0 && Objects.equals(wrap, that.wrap) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wrap, product, weight);
    }

    @Override
    public String toString() {
        return "wrappedWeightProduct{" +
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", wrap=" + wrap +
                ", product=" + product +
                ", weight=" + weight +
                '}';
    }
}
