import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] s) {

        /*
        String sw = File.readerIzFile("Запись");
        System.out.println(Metods.conversion(sw));
        System.out.println(Metods.registrVniz(sw));
        System.out.println(Metods.registrVverx(sw));
        System.out.println("Колличество символа в строке: " + Metods.collichSymbol(sw, 'а'));
        */

        try {
            Files.lines(Paths.get("Запись"))
                    .map(Metods::conversion)
                    .map(Metods::registrVniz)
                    //.forEach(System.out::println);
                    .map(Metods::registrVverx)
                    //.map(Metods::collichSymbol)
                    .forEach(File::writeToFile);

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}


