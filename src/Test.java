import java.util.Objects;

public class Test {
    private int attempts;
    private  String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test test = (Test) o;
        return attempts == test.attempts && Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attempts, name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
