import java.util.Objects;

public class product {
    public String Name;
    public String Description;

    public product (String Name, String Description) throws NullPointerException {
        if (Name == "" || Description == "")
            throw new NullPointerException("Поля названия и описания не могут быть пустыми");
        this.Description = Description;
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        product product = (product) o;
        return Objects.equals(Name, product.Name) && Objects.equals(Description, product.Description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Description);
    }

    @Override
    public String toString() {
        return "product{" +
                "Name ='" + Name + '\'' +
                ", Description ='" + Description + '\'' +
                '}';
    }
}
