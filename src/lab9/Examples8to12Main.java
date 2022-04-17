package lab9;

import static lab9.Examples8to12.*;

public class Examples8to12Main {
    public static void main(String[] args) {

        System.out.println(m());
        System.out.println(m1());
        System.out.println(m2());

        try{
            System.out.println("11. Применение finally после catch");
            System.out.println("0");
            throw new NullPointerException("ошибка");  //самостоятельно генерируем исключение
        }catch (NullPointerException e){ //перехват исключения и обработка
            System.out.println("1");
        }finally { //оператор finally всегда выполняется и здесь тоже
            System.out.println("2");
        }
        System.out.println("3"); //эта строка также выполняется

       // m3(null, 5); //после вывода первой ошибки программа автоматически прерывается
        m3("Friday", 0);

    }
}
