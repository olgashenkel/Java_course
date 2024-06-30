public class Main_8 {
    public static void main(String[] args) {

// Попробуем написать метод, который принимает на вход возраст ребенка и определяет, младенец ли он. Младенцами считаются дети до года:
//
//// Метод, возвращающий boolean, называется предикатом
//// Обычно такие методы имеют префикс has, can, is, was и так далее

//Пользуемся тем фактом, что любая операция — это выражение. Поэтому единственной строчкой функции пишем «вернуть то значение, которое получится в результате сравнения age < 1».
//
//В зависимости от пришедшего параметра, сравнение будет либо истинным (true), либо ложным (false). В итоге return вернет этот результат:
//
        System.out.println(isInfant(3)); // => false
        System.out.println(isInfant(0)); // => true
        System.out.println(isFirstLetterInUpperCase("marmond"));
        System.out.println(isFirstLetterInUpperCase("Bob"));

// Но если строка возвращается из метода, то она помещается в свою область памяти со своим уникальным адресом:
//
//// Выделяется новая память в любом случае
        var name1 = "java".toUpperCase(); // "JAVA"
//// Выделяется новая память в любом случае
        var name2 = "java".toUpperCase(); // "JAVA"
//        name1 == name2; // false
//Может показаться, что ссылочные данные приносят сплошные проблемы. На самом деле они нужны.
// Это станет понятно, когда мы столкнемся с изменяемостью в будущем.
//
//В прикладном программировании мы чаще сравниваем строки по значению, чем по ссылке.
// Для этого в строки встроен метод equals():
//
        var name_1 = "java".toUpperCase(); // "JAVA"
        var name_2 = "java".toUpperCase(); // "JAVA"
        System.out.println(name_1.equals(name_2)); // true
//
//Помимо equals(), в строки встроен метод equalsIgnoreCase(), который выполняет проверку по значению без учета регистра:
//
        var name11 = "java".toUpperCase(); // "JAVA"
        var name22 = "java".toLowerCase(); // "java"
        System.out.println(name11.equalsIgnoreCase(name22)); // true
//Иногда сравнение строк в Java ведет себя как сравнение значений, но никогда не делайте ставку на это.
// При изменении кода легко забыть поправить проверку и получить ошибку.
// Всегда используйте методы, когда нужно сравнивать по значению.

    }

    public static boolean isInfant(int age) {
        return age < 1;
    }

    public static boolean isFirstLetterInUpperCase(String string) {
        var firstLatter = string.charAt(0);
        System.out.print("проверяет, заглавная ли первая буква: " + string + " - ");
//        return Character.isUpperCase(firstLatter); // Класс Character содержит различные методы для работы с символом
// Метод isUpperCase() проверяет, что переданный символ в верхнем регистре
        return Character.isDigit(firstLatter);
    }
}

