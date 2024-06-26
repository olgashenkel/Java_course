/* Задача.
📌 Напишите метод, который вернет содержимое текущей папки в виде
массива строк.
📌 Напишите метод, который запишет массив, возвращенный предыдущим
методом в файл.
📌 Обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог-файл.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task_5 {
    private static Logger logger = Logger.getLogger(Task_5.class.getName());
    public static void main(String[] args) {
        configLogger();
        String[] contentFolder = getFileList(System.getProperty("user.dir"));
//        writeArrayToFile(contentFolder, "contentFolder.txt");   // в данном случае программа сработает без ошибок
        writeArrayToFile(contentFolder, ".");   // в данном случае программа должна выдать ошибку и произвестить запись в log.txt файл
    }

    public static String[] getFileList(String folderName) {
        File currentFolder = new File(folderName);
        return currentFolder.list();
    }

    public static void configLogger() {     // создание log.файла
        try {
            logger.setUseParentHandlers(false);     // данная команда позволяет не выводить сообщение в терминал. Дальнейший код запишет данные только в созданный файл (в данном случае log.txt)
            FileHandler fh = new FileHandler("log.txt", true);      // команда append:true - позволяет дозаписывать данные в файл
            logger.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeArrayToFile(String[] arr, String fileName) {
        try (FileWriter fr = new FileWriter(fileName, true)) {    // параметр append:true - позволяет дозаписывать данные в файл
            for (String elem : arr) {

                fr.write(elem);
                fr.write(System.lineSeparator());   // System.lineSeparator() - производит перевод на новую строку для новой записи
            }
            logger.info("Данные успешно записаны.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            logger.warning("Ошибка записи в файл.");
        }
    }

}
