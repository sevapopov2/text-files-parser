package FilesParser;

public class ParserFactory {
    public static TextFilesReader getParser(String filePath) {
        if (filePath.endsWith(".txt")) {

            return new TextFilesReader(filePath);
        }
        return null;
    }
}
