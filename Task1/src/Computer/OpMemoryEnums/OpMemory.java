package Computer.OpMemoryEnums;

public class OpMemory {
    private OpMemType opMemType;
    private double volume;
    private double weight;

    public OpMemory(OpMemType opMemType, double volume, double weight) {
        this.opMemType = opMemType;
        this.volume = volume;
        this.weight = weight;
    }

    public OpMemory() {
    }

    public OpMemType getOpMemType() {
        return opMemType;
    }

    public void setOpMemType(OpMemType opMemType) {
        this.opMemType = opMemType;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "OpMemory{" +
                "opMemType=" + opMemType +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
