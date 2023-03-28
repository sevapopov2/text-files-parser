package FilesParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LogFilesParser implements Parser {
    private String filePath;

    public LogFilesParser(String filePath) {
        this.filePath = filePath;
    }

    public LogFilesParser(File file) {
        this.filePath = file.getAbsolutePath();
    }

    public List<Packet> startParse() {
        List<Packet> result = new ArrayList<>();

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(this.filePath));
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                if (!line.contains("***")) {
                    Packet packet = new Packet(line.split("; ")[0], line.split("; ")[1],
                            Integer.parseInt(line.split("; ")[3].replace(" bytes", "")));
                    result.add(packet);
                }
            }
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(result);
        return result;
    }

}
