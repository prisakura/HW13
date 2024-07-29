package Computer.ScreenEnums;

public class Screen {
    private double size;
    private ScreenType screenType;
    private double weight;

    public Screen(double size, ScreenType screenType, double weight) {
        this.size = size;
        this.screenType = screenType;
        this.weight = weight;
    }

    public Screen() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "size=" + size +
                ", screenType=" + screenType +
                ", weight=" + weight +
                '}';
    }
}
