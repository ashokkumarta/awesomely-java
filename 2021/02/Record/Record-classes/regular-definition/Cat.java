import java.util.Objects;

public final class Cat {

    private String color;

    public Cat(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        } else if (!(that instanceof Cat)) {
            return false;
        } else {
            Cat thatCat = (Cat) that;
            return Objects.equals(this.color, thatCat.color);
        }
    }

    @Override
    public int hashCode() {
        return this.color.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Cat[color=%s]", this.color);
    }
}