import java.util.Objects;

public class pieceProduct extends product{

    public double Weight;

    public pieceProduct (String Name, String Description, Double Weight) throws IllegalArgumentException{
        super(Name, Description);
        if(Weight <= 0.0)
            throw new IllegalArgumentException("Вес одой единицы товара должен быть больше, чем 0.0");
        this.Weight = Weight;
    }

    public double getWeight() {
        return Weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        pieceProduct that = (pieceProduct) o;
        return Double.compare(that.Weight, Weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Weight);
    }

    @Override
    public String toString() {
        return "pieceProduct{" +
                "Weight=" + Weight +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
