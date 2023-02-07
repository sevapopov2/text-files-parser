package FilesParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    public Reader(File file) {
        this.filePath = file.getAbsolutePath();
    }

    public List<Packet> startParse() {
        List<Packet> result = new ArrayList<>();

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(this.filePath));
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                result.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }

}
