import java.util.List;

public class Motor16 extends Motor{

    public Motor16() {
        super("Motor 1.6", List.of("one", "two", "three", "four"));
    }

    @Override
    public float produzirForca(float combustivel) {
        return combustivel * 1.8f;
    }

}
