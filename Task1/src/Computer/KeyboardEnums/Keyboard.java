package Computer.KeyboardEnums;

public class Keyboard {
private KeyboardType keyboardType;
private Lighting lighting;
private double weight;

    public Keyboard(KeyboardType keyboardType, Lighting lighting, double weight) {
        this.keyboardType = keyboardType;
        this.lighting = lighting;
        this.weight = weight;
    }

    public Keyboard() {
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(KeyboardType keyboardType) {
        this.keyboardType = keyboardType;
    }

    public Lighting getLighting() {
        return lighting;
    }

    public void setLighting(Lighting lighting) {
        this.lighting = lighting;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardType=" + keyboardType +
                ", lighting=" + lighting +
                ", weight=" + weight +
                '}';
    }
}
