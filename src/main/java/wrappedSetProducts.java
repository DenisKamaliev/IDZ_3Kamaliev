import java.util.Arrays;
import java.util.Objects;

public class wrappedSetProducts {
    productWrap wrap;
    Object[] array;
    public wrappedSetProducts(productWrap wrap, Object ... v)throws NullPointerException, IllegalArgumentException{
        if(wrap == null)
            throw new NullPointerException("Значение упаковки не может быть пустым!");
        this.wrap = wrap;
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

    public double getNet(){
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
    public double getGross(){
        return getNet() + wrap.getWrapWeight();
    }

    public Object[] getArray() {
        return array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        wrappedSetProducts that = (wrappedSetProducts) o;
        return Objects.equals(wrap, that.wrap) && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(wrap);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "wrappedSetProducts{" +
                "wrap=" + wrap +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
