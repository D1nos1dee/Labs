import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileCopy {

    public static void main(String[] args) {

        FileReader reader = null;
        FileWriter writer = null;

        try {

            reader = new FileReader("input.txt");

            writer = new FileWriter("output.txt");

            int symbol;

            while ((symbol = reader.read()) != -1) {

                writer.write(symbol);

            }

            System.out.println("Файл успешно скопирован");

        } catch (IOException e) {

            System.out.println("Ошибка при работе с файлами: "
                    + e.getMessage());

        } finally {

            try {

                if (reader != null) {
                    reader.close();
                }

                if (writer != null) {
                    writer.close();
                }

            } catch (IOException e) {

                System.out.println("Ошибка при закрытии файла");

            }

        }

    }

}