package src;
//N-ое треугольное число
//Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//***************
//Внутри класса Answer напишите метод countNTriangle, который принимает число n
// и возвращает его n-ое треугольное число.
//Если число n < 1 (ненатуральное) метод должен вернуть -1.
//**************

//Пример
//n = 4 -> 10
//n = 5 -> 15
//*******************************************************************************

public class DZ_1 {
    public static void main(String[] args) {
        System.out.println(countNTriangle(5));
    }

    static int countNTriangle(int n) {
        int sum = 0;
        if (n < 1) {
            return -1;
        } else {
            while (n > 0) {
                sum += n;
                n--;
            }
            return sum;
        }
    }
}


/*
Решение с сайта:
class Answer {
    public int countNTriangle(int n){
if (n < 1) return -1;
    int sum = 0;
    for(int i = 1; i <= n; i++){
          sum += i;
    }
    return sum;
    }
}

public class Printer{
    public static void main(String[] args) {
      int n = 0;

      if (args.length == 0) {
        n = 4;
      }
      else{
        n = Integer.parseInt(args[0]);
      }

      Answer ans = new Answer();
      int itresume_res = ans.countNTriangle(n);
      System.out.println(itresume_res);
    }
}

 */