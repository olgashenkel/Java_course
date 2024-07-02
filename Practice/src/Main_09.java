import java.util.Scanner;

public class Main_09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        System.out.print("Задание 1.: Введите любую строку на проверку регистра: ");
//        String str = in.nextLine();
//        System.out.println(getSentenceTone(str));


//        System.out.print("Задание 2.: Введите адрес сайта: ");
//        String strURL = in.nextLine();
//        System.out.println(normalizeUrl(strURL));

//        System.out.print("Задание 3.: Введите фамилию семьи: ");
//        String surname = in.nextLine();
//        System.out.println(whoIsThisHouseToStarks(surname));

//        System.out.print("Задание 4.: Введите строку: ");
//        String startString = in.nextLine();
//        System.out.println(convertString(startString));


        System.out.print("Задание 5.: Введите число: ");
        int number = in.nextInt();
        System.out.println(getNumberExplanation(number));

        in.close();

    }


// Задание 1.
//Реализуйте метод getSentenceTone(), который принимает строку
// и определяет тон предложения. Если все символы в верхнем регистре,
// то это вопль — scream. В ином случае — нормальное предложение — normal.
//
//Примеры вызова://
//App.getSentenceTone("Hello"); // "normal"
//App.getSentenceTone("WOW");  // "scream"

    public static String getSentenceTone(String str) {

        if (str == str.toUpperCase()) {
            return "scream";
        }
        return "normal";
    }

// Задание 2.
// Реализуйте метод normalizeUrl(), который выполняет так называемую
// нормализацию данных. Он принимает адрес сайта и возвращает его
// с https:// в начале.
//
//Метод принимает адреса в виде АДРЕС или https://АДРЕС,
// но всегда возвращает адрес в виде https://АДРЕС
//
//Можно использовать метод startsWith() чтобы проверить начинается
// ли строка с префикса https://. А потом на основе этого добавлять
// или не добавлять https://.
//
//App.normalizeUrl("google.com"); // "https://google.com"
//App.normalizeUrl("https://ai.fi"); // "https://ai.fi"

    public static String normalizeUrl(String strURL) {
        strURL.toLowerCase();
        if (strURL.startsWith("https://")) {
            return strURL;
        }
        return "https://" + strURL.toLowerCase();
    }


// Задание 3.
//На электронной карте Вестероса, которую реализовал Сэм,
// союзники Старков отображены зеленым кружком, враги — красным,
// а нейтральные семьи — серым.
//
//Напишите для Сэма метод whoIsThisHouseToStarks(),
// который принимает на вход фамилию семьи и возвращает одно из трех значений:
// "friend", "enemy", "neutral".
//
//Правила определения://
//Друзья ("friend"): "Karstark", "Tally"
//Враги ("enemy"): "Lannister", "Frey"
//Любые другие семьи считаются нейтральными

//Примеры вызова://
//App.whoIsThisHouseToStarks("Karstark"); // "friend"
//App.whoIsThisHouseToStarks("Frey");     // "enemy"
//App.whoIsThisHouseToStarks("Joar");     // "neutral"
//App.whoIsThisHouseToStarks("Ivanov");   // "neutral"


    public static String whoIsThisHouseToStarks(String surname) {
        var whatIsFamily = "";
        if (surname.startsWith("Karstark") | surname.startsWith("Tally")) {
            whatIsFamily = "friend";
        } else if (surname.startsWith("Lannister") | surname.startsWith("Frey")) {
            whatIsFamily = "enemy";
        } else whatIsFamily = "neutral";
        return whatIsFamily;
    }

// Задание 4.
//Реализуйте метод convertString(), который принимает на вход строку и,
// если первая буква не заглавная, возвращает перевернутый вариант исходной строки.
// Если первая буква заглавная, то строка возвращается без изменений.
// Если на вход передана пустая строка, метод должен вернуть пустую строку.
//
//App.convertString("Hello"); // "Hello"
//App.convertString("hello"); // "olleh"
//
//// Не забудьте учесть пустую строку!
//App.convertString(""); // ""
//StringUtils.reverse() – переворот строки
//Character.isUpperCase() – проверка символа на верхний регистр
//Попробуйте написать два варианта функции: с обычным if-else, и с тернарным оператором.

    public static String convertString(String startString) {
        if (startString == "") {
            return "";
        } //else if (Character.isUpperCase(startString.charAt(0))) {
        //return new StringBuilder(startString).reverse().toString();
        return Character.isUpperCase(startString.charAt(0)) ? startString : new StringBuilder(startString).reverse().toString();
//  перевернуть строку в Java?
//Самый банальный и простой способ — использовать StringBuilder/StringBuffer:
// Метод reverse() меняет порядок в StringBuffer на обратный

    }
//        return startString;
//    }


// Задание 5.
//Реализуйте метод getNumberExplanation(), который принимает на вход число
// и возвращает объяснение этого числа. Если для числа нет объяснения,
// то возвращается just a number. Объяснения есть только для следующих чисел://
//666 - devil number
//42 - answer for everything
//7 - prime number

//Примеры вызова функции://
//App.getNumberExplanation(8);   // just a number
//App.getNumberExplanation(666); // devil number
//App.getNumberExplanation(42);  // answer for everything
//App.getNumberExplanation(7);   // prime number

    public static String getNumberExplanation(int number) {
        switch (number) {
            case 666:
                return "devil number";
            case 42:
                return "answer for everything";
            case 7:
                return "prime number";
            default:
                return "just a number";
        }
    }

}
