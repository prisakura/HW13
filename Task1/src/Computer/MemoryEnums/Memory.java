package Computer.MemoryEnums;

public class Memory {
    private MemType memType;
    private double volume;
    private double weight;

    public Memory(MemType memType, double volume, double weight) {
        this.memType = memType;
        this.volume = volume;
        this.weight = weight;
    }

    public Memory() {
    }

    public MemType getMemType() {
        return memType;
    }

    public void setMemType(MemType memType) {
        this.memType = memType;
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
        return "Memory{" +
                "memType=" + memType +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
