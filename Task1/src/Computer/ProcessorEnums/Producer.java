package Computer.ProcessorEnums;

public enum Producer {
    INTEL ("Intel"),
    AMD ("AMD"),
    APPLE ("Apple");
private String value;

    Producer(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
