package Computer.ProcessorEnums;

public enum Frequency {
   f1000MHZ (1000),
    f1500MHZ (1500),
    f2000MHZ (2000),
    f2500MHZ (2500),
    f3000MHZ (3000),
    f3500MHZ (3500);

   private double value;

    Frequency(double value) {
        this.value = value;
    }

    public double getValue(){
        return value;
    }


}
