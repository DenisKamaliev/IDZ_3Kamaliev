import java.util.Objects;

public class weightProduct extends product{

    public weightProduct (String Name, String Description) throws NullPointerException {
        super(Name, Description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        weightProduct that = (weightProduct) o;
        return Objects.equals(Name, that.Name) && Objects.equals(Description, that.Description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Name, Description);
    }

    @Override
    public String toString() {
        return "weightProduct{" +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}

