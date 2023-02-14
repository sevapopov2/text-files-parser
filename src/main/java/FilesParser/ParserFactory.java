package FilesParser;

public class ParserFactory {
    public static TextFilesParser getParser(String filePath) {
        if (filePath.endsWith(".txt")) {

            return new TextFilesParser(filePath);
        }
        return null;
    }
}
