// Задание № 4
// Каталог товаров книжного магазина сохранен в виде двумерного
//списка List<ArrayList<String>> так, что на 0й позиции каждого
//внутреннего списка содержится название жанра, а на остальных
//позициях - названия книг. Напишите метод для заполнения данной
//структуры.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        ArrayList<String> ganre_1 = new ArrayList<>(Arrays.asList("ganre_1", "book_1", "book_2", "book_3"));
        ArrayList<String> ganre_2 = new ArrayList<>(Arrays.asList("ganre_2", "book_1", "book_2", "book_3"));
        ArrayList<String> ganre_3 = new ArrayList<>(Arrays.asList("ganre_3", "book_1", "book_2", "book_3"));
        ArrayList<String> ganre_4 = new ArrayList<>(Arrays.asList("ganre_4", "book_1", "book_2", "book_3"));
        catalog.addAll(Arrays.asList(ganre_1, ganre_2, ganre_3, ganre_4));

        for(ArrayList<String> ganre : catalog) {
            System.out.println(ganre);
        }

    }
}
