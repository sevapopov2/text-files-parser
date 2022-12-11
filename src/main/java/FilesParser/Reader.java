package FilesParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.StringReader;
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
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(this.filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readStrings(new BufferedReader(inputStreamReader));
    }

    public List<Packet> readStrings(String strings) {
        StringReader stringReader = new StringReader(strings);
        BufferedReader bufferedReader = new BufferedReader(stringReader);
        return readStrings(bufferedReader);
    }
}
