package FilesParser;

public class ParserFactory {
    public static LogFilesParser getParser(String filePath) {
        if (filePath.endsWith(".log")) {

            return new LogFilesParser(filePath);
        }
        return null;
    }
}
