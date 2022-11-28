package FilesParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    private String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    public Reader(File file) {
        this.filePath = file.getAbsolutePath();
    }

    public void readFile() {
        Scanner reader;
        try {
            reader = new Scanner(new File(filePath));
            while (reader.hasNextLine()) {
                String fileLine = reader.nextLine();
                System.out.println(fileLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

    }
}
