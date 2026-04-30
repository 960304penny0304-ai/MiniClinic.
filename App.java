import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        int lineCount = 0, wordCount = 0, charCount = 0;
        Scanner scanner = new Scanner(new File("Learning_Java.txt"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineCount++;
            charCount += line.length();

            if (!line.trim().isEmpty()) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        }

        scanner.close();

        System.out.println("行數：" + lineCount);
        System.out.println("字數：" + wordCount);
        System.out.println("字元數：" + charCount);
    }
}
