package Computer.KeyboardEnums;

public enum Lighting {
    StRGB ("Static RGB"),
    DynRGB ("Dynamic RGB"),
    NULL ("No"),
    LED ("LED");

    private String value;

    Lighting(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
