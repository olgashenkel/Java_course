/*
Массивы.
// ************************


 */
public class Task_3 {

    public class Ex01_object {
        static int[] AddItem(int[] array, int item) {
            int length = array.length;
            int[] temp = new int[length + 1];
            System.arraycopy(array, 0, temp, 0, length);
            temp[length] = item;
            return temp;
        }
        public static void main(String[] args) {

            // 1-ый способ:
//        int[] a = new int[]{1, 9};
//        int[] b = new int[30];
//        System.arraycopy(a, 0, b, 0, a.length); // с помощью функционала System.arraycopy указывается, что из массива a (с 0-го элемента) скопировать данные в массив b (также с 0-го элемента) всю длину массива a (a.length)
//        for (int i : a) {
//            System.out.printf("%d ", i);
//        } // 1 9
//        for (int j : b) {
//            System.out.printf("%d ", j);
//        } // 1 9 0 0 0 0 0 0 0 0

            // 2-ой способ (через метод static int[] AddItem (public class Ex01_object):
            int[] a = new int[]{0, 9};
            for (int i : a) {
                System.out.printf("%d ", i);
            }
            a = AddItem(a, 2);
            a = AddItem(a, 3);
            for (int j : a) {
                System.out.printf("%d ", j);
            }
        }
    }
}
