package car;

public class BMW implements Car{
    @Override
    public int getSpeed() {
        return 230;
    }

    @Override
    public String getName() {
        return "BMW";
    }
}
