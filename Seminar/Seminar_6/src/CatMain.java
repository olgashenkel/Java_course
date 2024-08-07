// Задание № 3
// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
//использовать не все придуманные поля и методы. Создайте несколько
//экземпляров этого класса, выведите их в консоль.
//2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
//его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

// Задание №4
//1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
//Поместите в него некоторое количество объектов.
//2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
//Убедитесь, что все они сохранились во множество.
//3. Создайте метод public boolean equals(Object o)
//Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
//должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
//4. Создайте метод public int hashCode()
//который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
//Objects.hash(...))
//5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CatMain {
    public static void main(String[] args) {

        Cat cat_1 = new Cat("Ivan", 15, "Black", "Petrov Petr");
        Cat cat_2 = new Cat("Murzic", 1, "White", "Ivanov Ivan");
        Cat cat_3 = new Cat("Vasiliy", 5, "Black", "Smirnov Andrey");
        Cat cat_4 = new Cat("Ivan", 15, "Black", "Petrov Petr");
        Cat cat_5 = new Cat("Ivan", 15, "Black", "Petrov Petr");

//        System.out.println(cat_1);    // К заданию № 3
//        System.out.println(cat_2);    // К заданию № 3
//        System.out.println(cat_3);    // К заданию № 3


//1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
//Поместите в него некоторое количество объектов.
//2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
//Убедитесь, что все они сохранились во множество.
        Set<Cat> cats = new HashSet<>(Arrays.asList(cat_1, cat_2, cat_3, cat_4, cat_5));
        for (Cat cat : cats) {
            System.out.println(cat);
        }

//3. Создайте метод public boolean equals(Object o)
//Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
//должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
        // Реализован в файле Cat.java:
        // @Override
        //    public boolean equals(Object obj)


//4. Создайте метод public int hashCode()
//который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
//Objects.hash(...))
        // Реализован в файле Cat.java:
        // @Override
        //    public int hashCode()

    }
}
