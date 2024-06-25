public class Task_2 {
    public static void main(String[] args) {
/*
Работа с файловой системой. Файлы

Для работы нужно:
File <имя> = new File(<полный путь к файлу>);
File f1 = new File("file.txt");     // относительный путь
File f2 = new File("/Users/sk/vscode/java_projects/file.txt");  // абсолютный (полный) путь
Что предпочтительнее?
---------------------------------------------------------------
Работа с файловой системой. Файлы. Ошибки
-----------------------------
try {
Код, в котором может появиться ошибка
} catch (Exception e) {
Обработка, если ошибка случилась
}
finally {
Код, который выполнится в любом случае
}
------------------------------------------

String line = "empty";
try {
File file = new File(pathFile);
if (file.createNewFile()) {
System.out.println("file.created"); }
else {
BufferedReader bufReader =
new BufferedReader(new FileReader(file));
System.out.println("file.existed");
line = bufReader.readLine();
bufReader.close(); }
} catch (Exception e) {
//e.printStackTrace();
} finally {
System.out.println(line);
}


isHidden(): возвращает истину, если каталог или файл является скрытым
length(): возвращает размер файла в байтах
lastModified(): возвращает время последнего изменения файла или каталога
list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles(): возвращает массив файлов и подкаталогов, которые находятся
в определенном каталоге
mkdir(): создает новый каталог
renameTo(File dest): переименовывает файл или каталог
length(): возвращает размер файла в байтах
lastModified(): возвращает время последнего изменения
файла или каталога
list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles(): возвращает массив файлов и подкаталогов, которые
находятся в определенном каталоге
mkdir(): создает новый каталог
renameTo(File dest): переименовывает файл или каталог


 */




    }
}
