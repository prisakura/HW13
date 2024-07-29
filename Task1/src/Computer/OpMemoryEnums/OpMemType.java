package Computer.OpMemoryEnums;

public enum OpMemType {
    DDR2 ("DDR2"),
    DDR3 ("DDR3"),
    DDR4 ("DDR4"),
    DDR5 ("DDR5");

    private String value;

    OpMemType(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
