// Задание № 0.
// 📌 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//📌 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
//Сравните с предыдущим.
// ************************

// Результат работы кода:
// Добавление в конец списка:
//ArrayList:
//20
//LinkedList:
//85
//
//Добавление в начало списка:
//ArrayList:
//5996
//LinkedList:
//39
//
//Добавление в середину списка:
//ArrayList:
//2252
//LinkedList:
//136720
// ************************
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task_1 {
    public static void main(String[] args) {

        int size = 200_000;

        System.out.println("Добавление в конец списка: ");
        System.out.println("ArrayList: ");
        long start = System.currentTimeMillis(); // фиксируем время
        getArrayListLast(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("LinkedList: ");
        start = System.currentTimeMillis(); // фиксируем время
        getLinkedListLast(size);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println();

        System.out.println("Добавление в начало списка: ");
        System.out.println("ArrayList: ");
        start = System.currentTimeMillis(); // фиксируем время
        getArrayListFirst(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("LinkedList: ");
        start = System.currentTimeMillis(); // фиксируем время
        getLinkedListFirst(size);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println();

        System.out.println("Добавление в середину списка: ");
        System.out.println("ArrayList: ");
        start = System.currentTimeMillis(); // фиксируем время
        getArrayListMiddle(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("LinkedList: ");
        start = System.currentTimeMillis(); // фиксируем время
        getLinkedListMiddle(size);
        System.out.println(System.currentTimeMillis() - start);

    }

    public static ArrayList<Integer> getArrayListLast(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addLast(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListLast(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addLast(i);
        }
        return linkedList;
    }


    public static ArrayList<Integer> getArrayListMiddle(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList.size()/2, i); // будет работать ка метод addFirst (добавляет значение вначале по индексу 0)
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListMiddle(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(linkedList.size()/2, i);
        }
        return linkedList;
    }


    public static ArrayList<Integer> getArrayListFirst(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addFirst(i); // будет работать ка метод addFirst (добавляет значение вначале по индексу 0)
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListFirst(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addFirst(i);
        }
        return linkedList;
    }
}
