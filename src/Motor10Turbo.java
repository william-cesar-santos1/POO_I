import java.util.List;

public class Motor10Turbo extends Motor{

    public Motor10Turbo() {
        super("Motor 1.0 turbo", List.of("one", "two", "three"));
    }

    @Override
    public float produzirForca(float combustivel) {
        return combustivel * 1.5f;
    }
}
