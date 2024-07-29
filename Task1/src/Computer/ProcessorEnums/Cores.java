package Computer.ProcessorEnums;

public enum Cores {
    c1(1),
    c2(2),
    c4(4),
    c6(6),
    c8(8);
    private int value;

    Cores(int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}
