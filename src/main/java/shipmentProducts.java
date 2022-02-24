import javax.management.Descriptor;
import java.util.Arrays;
import java.util.Objects;

public class shipmentProducts extends product{
    public Object[] array;
    public String description;

    public shipmentProducts(String Name,String Description, Object ... v)throws NullPointerException, IllegalArgumentException{
        super(Name, Description);
        for(int i =0; i<v.length;i++){
            if(v[i] ==null)
                throw new NullPointerException("Пустое значение товара №" + i);
            if(v[i].getClass() != wrappedWeightProduct.class && v[i].getClass() != wrappedPieceProduct.class && v[i].getClass() != wrappedSetProducts.class )
                throw new IllegalArgumentException("Элемент номер "+ i + " не является упаковкой товаров");
        }
        array = new Object[v.length];
        for(int i =0; i<v.length;i++){
            array[i]=v[i];
        }
    }
    public Double getMass(){
        double sum =0;
        for(int i = 0; i< array.length;i++){
            if(array[i].getClass() == wrappedPieceProduct.class){
                wrappedPieceProduct P = (wrappedPieceProduct) array[i];
                sum = sum + P.getGross();
            }
            if(array[i].getClass() == wrappedWeightProduct.class){
                wrappedWeightProduct P = (wrappedWeightProduct) array[i];
                sum = sum + P.getGross();
            }
            if(array[i].getClass() == wrappedSetProducts.class){
                wrappedSetProducts P = (wrappedSetProducts) array[i];
                sum = sum + P.getGross();
            }
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        shipmentProducts that = (shipmentProducts) o;
        return Arrays.equals(array, that.array) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), description);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "shipmentProducts{" +
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", array=" + Arrays.toString(array) +
                ", description='" + description + '\'' +
                '}';
    }
}
