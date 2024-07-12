// Задание № 3
// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
//использовать не все придуманные поля и методы. Создайте несколько
//экземпляров этого класса, выведите их в консоль.
//2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
//его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

import java.util.Objects;

public class Cat {
    public static void main(String[] args) {

    }
//    Кличка (name)
//    Год рождения (age)
//    Порода (bread)
//    Номер паспорта (passpot id)
//    Окрас (color)
//    Владелец (owner)
//    Пол (sex)
//    Награды (awards)

    private String name;    // privat - для исключения изменений извне.
    private int age;
    private String color;
    private String owner;

    public Cat(String name, int age, String color, String owner) {
        // public - конструктор всегда публичный (доступный извне)
        this.name = name;
        this.age = age;
        this.color = color;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        String result = newLine + "Кличка: " + name + newLine + "Возраст: " + age +
                newLine + "Окрас: " + color + newLine + "Владелец: " + owner +
                newLine + newLine + "*******************************************";
        // в Java предусмотрена специальная константа System.lineSeparator().
        // Это универсальный метод, который возвращает символ(ы)
        // новой строки в соответствии с текущей операционной системой.
        return result;
    }

//3. Создайте метод public boolean equals(Object o)
//Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
//должен возвращать true, только если значения во всех полях сравниваемых объектов равны.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            // 1. Сравниваем, что передаваемый объект не является тем же самым объектом (что мы не сравниваем его с самим собой)
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            // 2. Проверяем на пустоту и равенство классов
            // Метод .getClass() позволяет определить класс объекта во время
            // выполнения программы, что особенно полезно для контроля или логирования
            // при работе с полиморфными объектами
            return false;
        }
        // 3. Создаем само сравнение
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && age == cat.age &&
                color.equals(cat.color) && owner.equals(cat.owner);
        /* Cравниваем age через знак == так как значение int */
    }

//4. Создайте метод public int hashCode()
//который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
//Objects.hash(...))
        // Примечание: equals без hashCode не срабатывал (выводились дубликаты значений для элементов cat_4 и cat_5,
        // так как hashCode по умолчанию всегда разный (в классе Objects hashCode для каждого экземпляра класса разный hashCode)
        // данным методом (public int hashCode()) переопределили поведение hashCode, который зависит от параметров
        // в данном случае от параметров (name, age, color, owner)
        // теперь hashCode будет совпадать или отличатся в зависимости от заданных параметров (name, age, color, owner)
    @Override
    public int hashCode() {
        // При добавлении элементов в Set, сначала проверяются их хэш-код, если хэш-код совпадает,
        // тогда идет проверка по значению

        return Objects.hash(name, age, color, owner);
        // Статический метод Objects.hash() возвращает уникальный (с оговорками) числовой
        // код для всех переданных в него параметров.
    }
}


// В программировании на Java часто возникает необходимость использования символа перехода на новую строку.
// Это может потребоваться, например, при выводе информации в консоль или при записи данных в файл.
// В простейшем случае, это можно сделать с помощью специального escape-символа \n.
//
//Однако, использование \n может привести к проблемам при работе программы на различных платформах.
// Дело в том, что символ новой строки может отличаться в зависимости от операционной системы. Например,
// в Unix-подобных системах (включая Linux и MacOS) используется символ \n, в то время как в Windows — два символа: \r\n.
//
//Чтобы гарантировать корректное отображение новых строк независимо от платформы,
// в Java предусмотрена специальная константа System.lineSeparator().
// Это универсальный метод, который возвращает символ(ы) новой строки в соответствии с текущей операционной системой.