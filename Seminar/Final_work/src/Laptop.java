import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static java.lang.Integer.parseInt;

public class Laptop {

/*
Поля:
    Модель (model) --> Honor, Apple, Huawei, Asus, Acer, Lenovo, HP
    Оперативная память (RAM) --> 4ГБ, 8ГБ, 12ГБ, 16ГБ
    Объем жесткого диска (HDD) --> 256ГБ, 512ГБ, 1ТБ
    Операционная система (OS) --> Windows 10, Windows 11, Linux, macOS
    Цвет (color) --> белый, красный, бежевый, черный, серебристый
 */

    private String model;
    private int ram;
    private int hdd;
    private String operatingSystem;
    private String color;

//    быстрый способ написания стандартных конструкторов, геттеров и сеттеров в своем классе -
//    использовать комбинацию клавиш alt+Insert в Intellij Idea - Откроется окно Generate со списком того,
//    что можно сгенерировать в классе.

    public Laptop(String model, int ram, int hdd, String operatingSystem, String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
       this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
       this.hdd = hdd;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        String result = newLine + "Модель ноутбука: " + model + newLine +
                "Оперативная память (RAM): " + ram + "ГБ" + newLine + "Объем жесткого диска (HDD): " + hdd + "ГБ"
                + newLine + "Операционная система: " + operatingSystem + newLine +
                "Цвет ноутбука: " + color + newLine + newLine +
                "**********************************************************";
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Сравниваем, что передаваемый объект не является тем же самым объектом (что мы не сравниваем его с самим собой)
        if (this == obj) {
            return true;
        }
        // 2. Проверяем на пустоту и равенство классов
        if (obj == null || getClass() != obj.getClass()) {
            // Метод .getClass() позволяет определить класс объекта во время выполнения программы
            return false;
        }
        // 3. Создаем само сравнение
        Laptop laptop = (Laptop) obj;
        return model.equals(laptop.model) && ram == laptop.ram && hdd == laptop.hdd &&
                operatingSystem.equals(laptop.operatingSystem) && color.equals(laptop.color);
        /* Cравниваем ram и hdd через знак == так как значение int */
    }

    @Override
    public int hashCode() {
        // При добавлении элементов в Set, сначала проверяются их хэш-код, если хэш-код совпадает,
        // тогда идет проверка по значению

        return Objects.hash(model, ram, hdd, operatingSystem, color);
        // Статический метод Objects.hash() возвращает уникальный (с оговорками) числовой
        // код для всех переданных в него параметров.
    }

    public static void gritings() {
// Метод для приветствия пользователя
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH");
        int time = parseInt(formatForDateNow.format(dateNow));
        if (time >= 22 && time <= 23 || time >= 0 && time < 4) {
            System.out.println("Доброй ночи, уважаемый гость!");
            System.out.println("Мы рады приветствовать Вас в нашем приложении по выбору ноутбука.");
        } else if (time >= 4 && time < 12) {
            System.out.println("Доброе утро, уважаемый гость!");
            System.out.println("Мы рады приветствовать Вас в нашем приложении по выбору ноутбука.");
        } else if (time >= 12 && time < 18) {
            System.out.println("Добрый день, уважаемый гость!");
            System.out.println("Мы рады приветствовать Вас в нашем приложении по выбору ноутбука.");
        } else {
            System.out.println("Добрый вечер, уважаемый гость!");
            System.out.println("Мы рады приветствовать Вас в нашем приложении по выбору ноутбука.");
        }
    }
}
