public class Main {
  public static void main(String args[]){
    // арифметические операторы
    int a = 5;
    int b = 11;
    System.out.println("a + b = " + (a * b));
    System.out.println("a - b = " + (a + b));
    System.out.println("a * b = " + (a - b));
    System.out.println("b / a = " + (b / a));
    System.out.println("b % a = " + (b % a));
    System.out.println("--a = " + (--a));
    System.out.println("++a = " + (++a));
    System.out.println("a++ = " + (a++));
    System.out.println("a-- = " + (a--));

    // переполнение операторов
    byte varByte = 100 + 28;
    System.out.println(varByte); // ошибка

    short varShort = 32700 + 68;
    System.out.println(varShort); // ошибка

    int varInt = 2147483646 + 2;
    System.out.println(varInt);

    // Операторы сравнения
    int d = 10;
    int e = 15;
    System.out.println("d < e = " + (d < e));
    System.out.println("d > e = " + (d > e));
    System.out.println("d == e = " + (d == e));
    System.out.println("d >= e = " + (d >= e));
    System.out.println("d <= e = " + (d <= e));
    System.out.println("d != e = " + (d != e));

    // Разные типы данных

    int one = 5;
    double two = 15.55;
    float three = 5.23f;
    System.out.println("one + two = " + (one + two));
    System.out.println("two - one = " + (two - one));
    System.out.println("one + three = " + (one + three));





  }
}
