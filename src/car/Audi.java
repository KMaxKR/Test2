package car;

public class Audi implements Car {
    @Override
    public int getSpeed() {
        return 120;
    }

    @Override
    public String getName() {
        return "AUDI";
    }
}
