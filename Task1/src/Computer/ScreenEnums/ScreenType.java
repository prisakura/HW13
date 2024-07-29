package Computer.ScreenEnums;

public enum ScreenType {
    IPS ("IPS"),
    TN ("TN"),
    TFT ("TFT"),
    VA ("VA");

    private String value;

    ScreenType(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
