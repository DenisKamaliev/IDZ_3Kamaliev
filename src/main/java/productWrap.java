import java.util.Objects;

public class productWrap {
    private String wrapName;
    private Double wrapWeight;

    public productWrap(String wrapName, Double wrapWeight) throws IllegalArgumentException, NullPointerException  {
        if (wrapWeight <= 0)
            throw new IllegalArgumentException("Вес упаковки должен быть больше, чем 0.0");
        this.wrapWeight = wrapWeight;
        if (wrapName == "")
            throw new NullPointerException("Название упаковки не может быть пустым!");
            this.wrapName = wrapName;
    }

    public String getWrapName() {
        return wrapName;
    }

    public Double getWrapWeight() {
        return wrapWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        productWrap that = (productWrap) o;
        return Objects.equals(wrapName, that.wrapName) && Objects.equals(wrapWeight, that.wrapWeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wrapName, wrapWeight);
    }

    @Override
    public String toString() {
        return "productWrap{" +
                "wrapName ='" + wrapName + '\'' +
                ", wrapWeight =" + wrapWeight +
                '}';
    }
}
