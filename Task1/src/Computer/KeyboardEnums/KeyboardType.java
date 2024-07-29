package Computer.KeyboardEnums;

public enum KeyboardType {
    FULL("Full-sized"),
    MINI("Min-sized"),
    WASD("\"WASD\"-sized");

    private String value;

    KeyboardType(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
