package lab9;

import static lab9.Example14.m4;

public class Example14Main {

    public static void main(String[] args) {
        try{//контролируем блок кода, который может вызвать ошибку
            int i = args.length;
            System.out.println("14. Исключение порождено методом m4 в методе main");
            System.out.println("размер массива = " + i);//методу main не присваивали аргументы
            m4(i);
        }catch (ArithmeticException e){//перехват ошибки в методе m4 и ее обработка
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
