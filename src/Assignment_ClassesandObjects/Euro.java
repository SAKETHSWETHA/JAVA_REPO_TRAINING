package Assignment_ClassesandObjects;

import java.util.Objects;

public class Euro {
    int value;

    public Euro(int value){
    this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Euro euro = (Euro) o;
        return value == euro.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
    public Euro sum(Euro euro){
        return new Euro( this.value+euro.value);
    }
}
