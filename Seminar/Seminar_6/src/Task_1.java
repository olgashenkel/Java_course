// Задание № 0
//1. Создайте HashSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
//Распечатайте содержимое данного множества.
//2. Создайте LinkedHashSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
//Распечатайте содержимое данного множества.
//3. Создайте TreeSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
//Распечатайте содержимое данного множества.

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {

//        Set<Integer> hashSet = new HashSet<>(); // Создание HashSet - пустого списка
//        hashSet.add(3);   // Добавление в коллекцию по одному элементу

        Set<Integer> hashSet = new HashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));   // Создание HashSet - списка на основе массива
        System.out.println(hashSet);    // [33, 3, 4, 6, 7, 8, 43, 11]

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));   // Создание HashSet - списка на основе массива
        System.out.println(linkedHashSet);  // [3, 6, 43, 8, 11, 7, 33, 4]

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));   // Создание HashSet - списка на основе массива
        System.out.println(treeSet);    // [3, 4, 6, 7, 8, 11, 33, 43]

    }


}