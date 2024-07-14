// ДЗ
//📌 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//📌 Создать множество ноутбуков.
//📌 Написать метод, который будет запрашивать у пользователя критерий (или критерии)
//фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …

//📌 Далее нужно запросить минимальные значения для указанных критериев - сохранить
//параметры фильтрации можно также в Map.
//📌 Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

/*
Поля:
    Модель (model) --> Honor, Apple, Huawei, Asus, Acer, Lenovo, HP
    Оперативная память (RAM) --> 4ГБ, 8ГБ, 12ГБ, 16ГБ
    Объем жесткого диска (HDD) --> 256ГБ, 512ГБ, 1ТБ
    Операционная система (OS) --> Windows 10, Windows 11, Linux, macOS
    Цвет (color) --> белый, красный, бежевый, черный, серебристый
 */


import java.util.*;


public class LaptopMain {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Laptop.gritings();  // Приветствие пользователя в зависимости от времени суток

        // Создание коллекции Set для хранения сведений о ноутбуках
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Honor", 4, 500, "Windows 11", "Серебристый"));
        laptops.add(new Laptop("Apple MacBook", 8, 1024, "MacOS", "Белый"));
        laptops.add(new Laptop("Huawei", 16, 1024, "Windows 11", "Чёрный"));
        laptops.add(new Laptop("Honor", 16, 2048, "Windows 10", "Бежевый"));
        laptops.add(new Laptop("Lenovo", 8, 500, "Windows 10", "Красный"));
        laptops.add(new Laptop("Asus", 16, 500, "Windows 11", "Серебристый"));
        laptops.add(new Laptop("Lenovo", 4, 512, "Linux", "Бежевый"));
        laptops.add(new Laptop("HP", 8, 1024, "Linux", "Белый"));
        laptops.add(new Laptop("Apple MacBook", 16, 2048, "MacOS", "Чёрный"));
        laptops.add(new Laptop("Apple MacBook", 16, 2048, "MacOS", "Чёрный"));  // Добавлен для проверки работы методов equals и hashCode

        filterLaptop(requestLaptop(), laptops);


    }


    public static HashMap<String, String> requestLaptop() {
        // формирование фильтра на основе запроса пользователя

        HashMap<String, String> requestLaptop = new HashMap<>();

        System.out.println("Для вывода списка интересующих вас моделей, ответьте, пожалуйста на несколько вопросов." + System.lineSeparator());

        System.out.println("Выберите модель ноутбука.");
        System.out.println("Для корректности ввода Вы можете скопировать название (Ctrl + C) и вставить в поле для ввода (Ctrl + V).");
        System.out.println("1) Apple MacBook; \t 2) Asus; \t 3) Honor; \t 4) HP; \t 5) Huawei; \t 6) Lenovo; \t " +
                "7) Если затрудняетесь с ответом, нажмите Enter");
        System.out.print("Введите ваш ответ: ");
        requestLaptop.put("model", in.nextLine());
        System.out.println();

        System.out.println("Выберите объём оперативной памяти (RAM) (объём в ГБ): ");
        System.out.println("1) 4; \t 2) 8; \t 3) 16; \t " +
                "4) Если затрудняетесь с ответом, введите 0");
        System.out.print("Введите ваш ответ: ");
        requestLaptop.put("ram", in.nextLine());
        System.out.println();

        System.out.println("Выберите объём жесткого диска (HDD) (объём в ГБ): ");
        System.out.println("1) 500; \t 2) 512; \t 3) 1024; \t 4) 2048; \t  " +
                "5) Если затрудняетесь с ответом, введите 0");
        System.out.print("Введите ваш ответ: ");
        requestLaptop.put("hdd", in.nextLine());
        System.out.println();

        System.out.println("Выберите тип операционной системы: ");
        System.out.println("Для корректности ввода Вы можете скопировать название (Ctrl + C) и вставить в поле для ввода (Ctrl + V).");
        System.out.println("1) MacOS; \t 2) Linux; \t 3) Windows 10; \t 4) Windows 11; \t  " +
                "5) Если затрудняетесь с ответом, нажмите Enter");
        System.out.print("Введите ваш ответ: ");
        requestLaptop.put("operatingSystem", in.nextLine());
        System.out.println();

        System.out.println("Выберите цвет ноутбука: ");
        System.out.println("Для корректности ввода Вы можете скопировать название (Ctrl + C) и вставить в поле для ввода (Ctrl + V).");
        System.out.println("1) Бежевый; \t 2) Белый; \t 3) Красный; \t 4) Серебристый; \t 5) Чёрный; \t  " +
                "6) Если затрудняетесь с ответом, нажмите Enter");
        System.out.print("Введите ваш ответ: ");
        requestLaptop.put("color", in.nextLine());
        System.out.println();

        return requestLaptop;
    }

    public static void filterLaptop(HashMap<String, String> requestLaptop, Set<Laptop> laptops) {
        Boolean isResult = true;

        try {
            for (Laptop el : laptops) {

                if (requestLaptop.get("model").equals(el.getModel()) || requestLaptop.get("model").isEmpty()) {
                    if (Integer.parseInt(requestLaptop.get("ram")) == el.getRam() || Integer.parseInt(requestLaptop.get("ram")) == 0) {
                        if (Integer.parseInt(requestLaptop.get("hdd")) == el.getHdd() || Integer.parseInt(requestLaptop.get("hdd")) == 0) {
                            if (requestLaptop.get("operatingSystem").equals(el.getOperatingSystem()) || requestLaptop.get("operatingSystem").isEmpty()) {
                                if (requestLaptop.get("color").equals(el.getColor()) || requestLaptop.get("color").isEmpty()) {
                                    System.out.println(el);
                                    isResult = false;
                                }
                            }
                        }
                    }
                }

            }
            if (isResult) {
                System.out.println("К сожалению, по вашему запросу ничего не найдено");
            }
        } catch (Exception ex) {
            System.out.print("Ошибка! Некорректный ввод данных! ");
            System.out.println(ex.getMessage());

        } finally {
            System.out.println("Для завершения работы программы нажмите 'q'.");
            System.out.println("Для повторного запроса нажмите 0.");
            System.out.println("Для отображения ВСЕХ имеющихся в наличии ноутбуков нажмите 1");
            String answerStr = in.nextLine();
            if (answerStr.charAt(0) == 'q' || answerStr.charAt(0) == 'Q') {
                System.out.println("До новой встречи!");
            } else if (answerStr.charAt(0) == '1') {
                System.out.println(laptops.toString().replaceAll("^\\[|\\,|\\]$", ""));
            } else if (answerStr.charAt(0) == '0') {
                filterLaptop(requestLaptop(), laptops);
            } else {
                System.out.println("До новой встречи!");
            }
        }
        in.close();
    }
}