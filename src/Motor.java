import java.util.List;

public abstract class Motor implements ProduzirForca {

    private String name;
    private Boolean start;
    private List pistons;

    public Motor(
            String name,
            List pistons
    ) {
        this.name = name;
        this.pistons = pistons;
        this.start = false;
    }

    public String getName() {
        return name;
    }

    public void setStart(Boolean start) {
        this.start = start;
    }

    public Boolean getStart() {
        return start;
    }

    public List getPistons() {
        return pistons;
    }

    public abstract float produzirForca(float combustivel);

    @Override
    public String toString() {
        return "Motor{" +
                "name='" + name + '\'' +
                ", start=" + start +
                ", pistons=" + pistons +
                '}';
    }
}
