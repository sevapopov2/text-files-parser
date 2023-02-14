package FilesParser;

public class Main {
    public static void main(String[] args) {
        ParserFactory factory = new ParserFactory();
        LogFilesParser myLogParser = ParserFactory.getParser("src/main/resources/iptraf.log");
        myLogParser.startParse();

    }
}
