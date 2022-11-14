package FilesParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    private File fileName;

    public Reader(File fileName) {
        this.fileName = fileName;
    }

    public void readFile() {
        try {
            Scanner fileReader = new Scanner(fileName);
            while (fileReader.hasNextLine()) {
                String fileLine = fileReader.nextLine();
                System.out.println(fileLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
