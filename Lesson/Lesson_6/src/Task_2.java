// TreeSet
// ****************************
//Обобщенный класс TreeSet<E> представляет структуру данных в виде дерева,
// в котором все объекты хранятся в отсортированном виде по возрастанию.
// TreeSet является наследником класса AbstractSet и реализует интерфейс NavigableSet, а следовательно,
// и интерфейс SortedSet.

// ● В основе HashMap.
//● Упорядочен по возрастанию.
//● null’ов быть не может.

//В классе TreeSet определены следующие конструкторы:
//•	TreeSet(): создает пустое дерево
//•	TreeSet(Collection<? extends E> col): создает дерево, в которое добавляет все элементы коллекции col
//•	TreeSet(SortedSet <E> set): создает дерево, в которое добавляет все элементы сортированного набора set
//•	TreeSet(Comparator<? super E> comparator): создает пустое дерево, где все добавляемые элементы впоследствии будут отсортированы компаратором.

//TreeSet поддерживает все стандартные методы для вставки и удаления элементов

// HashSet как синоним множества
// addAll(Coll) – объединение множеств.
//retainAll(Coll) – пересечение множеств.
//removeAll(Coll) – разность множеств.


import java.util.Arrays;
import java.util.TreeSet;

public class Task_2 {
    public static void main(String[] args) {

        var a = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(a.headSet(4)); // [1, 2, 3]
        System.out.println(a.tailSet(4)); // [4, 5, 6, 7]
        System.out.println(a.subSet(3, 5)); // [3, 4]

    }
}
