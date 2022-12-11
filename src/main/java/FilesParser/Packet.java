package FilesParser;

public class Packet {
    private final String date;
    private final String type;
    private final int bytes;

    public Packet(String date, String type, int bytes) {
        this.date = date;
        this.type = type;
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return "Packet{" +
                "Date=" + date +
                ", type=" + type +
                ", Bytes=" + bytes +
                "}";

    }
}
