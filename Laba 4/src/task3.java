import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

class CustomEmailFormatException extends Exception {

    public CustomEmailFormatException(String message) {

        super(message);

    }

}

public class task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите email: ");

        String email = scanner.nextLine();

        try {

            if (!email.contains("@") || !email.contains(".")) {

                throw new CustomEmailFormatException(
                        "Неверный формат email"
                );

            }

            System.out.println("Email корректный");

        } catch (CustomEmailFormatException e) {

            System.out.println("Ошибка: " + e.getMessage());

            logException(e);

        }

    }

    public static void logException(Exception e) {

        try {

            FileWriter writer =
                    new FileWriter("log.txt", true);

            writer.write(
                    "Дата: " + LocalDateTime.now() + "\n"
            );

            writer.write(
                    "Ошибка: " + e.getMessage() + "\n"
            );

            writer.write(
                    "-------------------------\n"
            );

            writer.close();

        } catch (IOException ex) {

            System.out.println(
                    "Ошибка записи в лог-файл"
            );

        }

    }

}