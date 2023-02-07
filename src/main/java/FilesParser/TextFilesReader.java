package FilesParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class TextFilesReader implements Reader {
    private String filePath;

    public TextFilesReader(String filePath) {
        this.filePath = filePath;
    }

    public TextFilesReader(File file) {
        this.filePath = file.getAbsolutePath();
    }

    public List<Packet> startParse() {
        List<String> result = new ArrayList<>();

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(this.filePath));
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                Packet packet = new Packet(line.split("; ")[0], line.split("; ")[1], line.split("; ")[2]);
                result.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}
