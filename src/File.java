import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class File {

    public static String readerIzFile(String name) {
        try (BufferedReader br = new BufferedReader(new FileReader("Запись"))) {
            while (br.ready()) {
                return br.readLine();
            }
            br.close();
        } catch (IOException ex) {

            System.out.println("Не считалось");
        }
        return null;
    }
/*
    public static void writeToFile(String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Вывод"))) {
            bw.write(text);
            bw.close();
        } catch (IOException ex) {

            System.out.println("Не записалось");
        }
    }
*/

    static ArrayList<String> result = new ArrayList<String>();
    public static void writeToFile(String text) {
        try {
            result.add(text);
            Files.write(Paths.get("Вывод"), result, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}