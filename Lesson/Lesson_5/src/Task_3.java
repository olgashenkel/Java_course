// LinkedHashMap — это специальный вид HashMap,
// который сохраняет порядок добавления элементов.
// Это достигается за счет поддержки двусвязного списка элементов. Поэтому,
// при выводе элементов на экран, порядок их следования будет соответствовать
// порядку добавления. Это может быть полезно, если сохранение порядка
// добавления элементов важно для бизнес-логики приложения.

// Красно-чёрное дерево
//Как ты наверняка заметил, под капотом TreeMap использует структуру данных,
// которая называется красно-чёрное дерево. Именно хранение данных
// в этой структуре и обеспечивает порядок хранения данных.
//
//Представь, что тебе необходимо хранить пары “Число-Строка”.
// Числа 16, 20, 52, 55, 61, 65, 71, 76, 81, 85, 90, 93, 101 будут ключами.
// Если ты хранишь данные в традиционном списке и появляется необходимость найти элемент с ключом 101,
// нужно будет перебрать все 13 элементов в его поисках. Для 13 элементов это не критично,
// при работе с миллионом у нас возникнут большие неприятности. Для решения таких проблем программисты
// используют немного более сложные структуры данных. Поэтому встречай красно-чёрное дерево!

// Поиск нужного элемента начинается из корня дерева, в нашем случае это 61.
// Дальше происходит сравнение с необходимым значением. Если наше значение меньше — отправляемся в левую сторону,
// если больше — в правую. Так происходит до тех пор, пока не найдем необходимое значение или не упремся в элемент
// со значением null (листок дерева). Красные и черные цвета используются для упрощения навигации по дереву и его балансировки.
// Существуют правила, которые всегда должны быть соблюдены при постройке красно-черного дерева:
//Корень должен быть окрашен в черный цвет.
//Листья дерева должны быть черного цвета.
//Красный узел должен иметь два черных дочерних узла.
//Черный узел может иметь любые дочерние узлы.
//Путь от узла к его листьям должен содержать одинаковое количество черных узлов.
//Новые узлы добавляются на места листьев.
//Если посмотреть на правила 3, 4 и 5 в совокупности, можно понять, как окраска узлов ускоряет навигацию по дереву:
// путь через черные узлы всегда короче, чем через красные. Поэтому по количеству именно черных узлов и определяется
// общий размер дерева, и называется этот размер “черная высота”.


//Методы, полученные из интерфейсов SortedMap и NavigableMap
//Как и HashMap, TreeMap имплементирует интерфейс Map, а это значит, что в TreeMap есть все те методы, что и в HashMap.
// Но вдобавок TreeMap реализует интерфейсы SortedMap и NavigableMap, получая дополнительный функционал из них.
//
//SortedMap — интерфейс, который расширяет Map и добавляет методы, актуальные для отсортированного набора данных:
//firstKey(): возвращает ключ первого элемента мапы;
//lastKey(): возвращает ключ последнего элемента;
//headMap(K end): возвращает мапу, которая содержит все элементы текущей, от начала до элемента с ключом end;
//tailMap(K start): возвращает мапу, которая содержит все элементы текущей, начиная с элемента start и до конца;
//subMap(K start, K end): возвращает мапу, которая содержит все элементы текущей,начиная с элемента start и до элемента с ключом end.
//NavigableMap — интерфейс, который расширяет SortedMap и добавляет методы для навигации между элементами мапы:
//firstEntry(): возвращает первый пару “ключ-значение”;
//lastEntry(): возвращает последнюю пару “ключ-значение”;
//pollFirstEntry(): возвращает и удаляет первую пару;
//pollLastEntry(): возвращает и удаляет последнюю пару;
//ceilingKey(K obj): возвращает наименьший ключ k, который больше или равен ключу obj. Если такого ключа нет, возвращает null;
//floorKey(K obj): возвращает самый большой ключ k, который меньше или равен ключу obj. Если такого ключа нет, возвращает null;
//lowerKey(K obj): возвращает наибольший ключ k, который меньше ключа obj. Если такого ключа нет, возвращает null;
//higherKey(K obj): возвращает наименьший ключ k, который больше ключа obj. Если такого ключа нет, возвращает null;
//ceilingEntry(K obj): аналогичен методу ceilingKey(K obj), только возвращает пару “ключ-значение” (или null);
//floorEntry(K obj): аналогичен методу floorKey(K obj), только возвращает пару “ключ-значение” (или null);
//lowerEntry(K obj): аналогичен методу lowerKey(K obj), только возвращает пару “ключ-значение” (или null);
//higherEntry(K obj): аналогичен методу higherKey(K obj), только возвращает пару “ключ-значение” (или null);
//descendingKeySet(): возвращает NavigableSet, содержащий все ключи, отсортированные в обратном порядке;
//descendingMap(): возвращает NavigableMap, содержащую все пары, отсортированные в обратном порядке;
//navigableKeySet(): возвращает объект NavigableSet, содержащий все ключи в порядке хранения;
//headMap(K upperBound, boolean incl): возвращает мапу, которая содержит пары от начала и до элемента upperBound. Аргумент incl указывает, нужно ли включать элемент upperBound в возвращаемую мапу;
//tailMap(K lowerBound, boolean incl): функционал похож на предыдущий метод, только возвращаются пары от lowerBound и до конца;
//subMap(K lowerBound, boolean lowIncl, K upperBound, boolean highIncl): как и в предыдущих методах, возвращаются пары от lowerBound и до upperBound, аргументы lowIncl и highIncl указывают, включать ли граничные элементы в новую мапу.
//
//В самой же реализации TreeMap, кроме привычных нам конструкторов,  добавляется еще один, который принимает экземпляр компаратора. Этот компаратор и будет отвечать за порядок хранения элементов.

// Если нужна скорость - используется HashMap
// Если нужен порядок элементов, но не сильно нужна скорость - LinkedHashMap
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task_3 {
    public static void main(String[] args) {

        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}

    }
}
