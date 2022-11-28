package FilesParser;

public class Main {
    public static void main(String[] args) {
        Reader myReader = new Reader("src/main/resources/da.txt");
        myReader.readFile();
    }
}
