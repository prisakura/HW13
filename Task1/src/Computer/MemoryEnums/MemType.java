package Computer.MemoryEnums;

public enum MemType {
    HDD ("HDD"),
    SSD ("SSD"),
    NVME("SSD-NVME");

    private String value;

    MemType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
