import java.util.Objects;

public class Sayan {

    int sayanId;

    String name;

    public Sayan(int sayanId, String name) {
        this.sayanId = sayanId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Sayan sayan = (Sayan) o;
        return sayanId == sayan.sayanId;
    }



    @Override
    public int hashCode() {
        return Objects.hashCode(sayanId);
    }
}
