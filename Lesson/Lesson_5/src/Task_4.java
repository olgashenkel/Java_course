// HashTable
// **************************

//«Устаревший брат» коллекции HashMap, который не знает про null

// ****************************************
// В чем разница между HashMap и Hashtable
// ****************************************

// Hashtable — это структура данных для хранения пар ключей и их значений, основанная на хешировании и реализации интерфейса Map.
//
//HashMap также является структурой данных для хранения ключей и значений, основанной на хешировании и реализации интерфейса Map.
// HashMap позволяет быстро получить значение по ключу. Например, имя пользователя и номер его телефона.
//
//Между HashMap и Hashtable в Java есть существенные различия. К ним относятся безопасность потоков,
// синхронизация и согласованность реализации Map. Важно учитывать эти аспекты при выборе типа структуры данных
// для использования в вашей Java-программе:
//
//HashMap — это несинхронизированная неупорядоченная карта пар ключ-значение (key-value).
// Она допускает пустые значения и использует хэш-код в качестве проверки на равенство,
// в то время как Hashtable представляет собой синхронизированную упорядоченную карту пар ключ-значение.
// Она не допускает пустых значений и использует метод equals() для проверки на равенство.
//
//HashMap по умолчанию имеет емкость 16, а начальная емкость Hashtable по умолчанию — 11.
//
//Значения объекта HashMap перебираются с помощью итератора, а Hashtable — это единственный класс,
// кроме вектора, который использует перечислитель (enumerator) для перебора значений объекта Hashtable.
//
//Помните, что различия между HashMap и Hashtable — один из самых популярных вопросов на собеседованиях по Java.

// ***************************************************************
// Как найти и исправить исключение NullPointerException в Java
// ***************************************************************

// Что такое исключение NullPointerException?
//java.lang.NullPointerException является исключением времени выполнения в Java. Оно возникает,
// когда происходит попытка доступа к переменной, которая не указывает ни на какой объект и ни на что не ссылается, то есть она равна нулю.
//
//Поскольку NullPointerException это исключение времени выполнения, его не нужно перехватывать и обрабатывать явно в коде приложения.
//При каких обстоятельствах возникает NullPointerException?
//NullPointerException возникает в ситуации, когда предпринимается попытка доступа к неинициализированному объекту.
// Как уже говорилось, это происходит, когда ссылка на объект никуда не ведет и имеет нулевое значение.
//
//Вот некоторые из наиболее распространенных сценариев исключения NullPointerException:
//Доступ к свойствам нулевого объекта.
//Выбрасывание null из метода, который выдает исключение.
//Неправильная конфигурация для инфраструктур внедрения зависимостей, например: (Spring).
//Передача нулевых параметров в метод.
//Вызов методов для нулевого объекта.
//Использование synchronized для нулевого объекта.
//Доступ к элементу index (например, в массиве) нулевого объекта.
//Пример исключения NullPointerException
//В этом примере мы пытаемся вызвать метод printLength, который принимает строку в качестве параметра и печатает ее длину.
// Если значение строки, которое передается в качестве параметра, равно нулю, то появится исключение java.lang.NullPointerException.

// Как избежать возникновения NullPointerException
//Появления NullPointerException можно избежать, используя следующие проверки и превентивные методы:
//Убедитесь, что объект правильно инициализирован, добавив проверку null перед обращением к его методам или свойствам.

//Используйте Apache Commons StringUtils для операций со строками: например, StringUtils.isNotEmpty() для проверки того,
// пуста ли строка перед ее дальнейшим использованием.

// По возможности используйте примитивы, а не объекты, поскольку они не могут иметь пустых ссылок.
// Например, используйте int вместо Integer и boolean вместо Boolean.
//
//Убедитесь, что вы дважды проверили свой код. Так вы снизите вероятность появления NullPointerException.

import java.util.Hashtable;
import java.util.Map;

public class Task_4 {
    public static void main(String[] args) {

        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); // java.lang.NullPointerException

    }
}
