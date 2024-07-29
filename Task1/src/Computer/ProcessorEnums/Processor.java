package Computer.ProcessorEnums;

public class Processor {
    private Frequency frequency;
    private Cores cores;
    private Producer producer;
    private double weight;

    public Processor(Frequency frequency, Cores cores, Producer producer, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.producer = producer;
        this.weight = weight;
    }

    public Processor() {
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public Cores getCores() {
        return cores;
    }

    public void setCores(Cores cores) {
        this.cores = cores;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", cores=" + cores +
                ", producer=" + producer +
                ", weight=" + weight +
                '}';
    }
}
