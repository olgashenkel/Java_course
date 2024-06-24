package src;

/*
Задание №4
Напишите метод, который находит самую длинную строку общего
префикса среди массива строк.
Если общего префикса нет, вернуть пустую строку "".
 */
public class Task_6 {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"}; // fl - общий префикс
        String pref = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pref) != 0) {    // indexOf(pref) - метод ищет уже целую подстроку, в данном случае pref = strs[0]
                pref = pref.substring(0, pref.length() - 1);    // .substring - метод возвращает подстроку, в данном случае от (0) до pref.length() - 1, т.е. позволяет убрать последний символ
            }
            if (pref.length() == 0) {
                break;
            }
        }
        System.out.println(pref);


    }
}
