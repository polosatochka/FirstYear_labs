package lab9;

import java.util.InputMismatchException;

public class Task3_1 {

    public static void summ(byte[] nums){
        double value = 0;
        double s = 0;
        for(byte x : nums){
            value = (s += x);
        }
        System.out.println("Сумма элементов массива = " + value);
    }

    public static void exceptionOne(byte y) throws InputMismatchException{
        if(-128 < y || y < 128){
            throw new InputMismatchException("Перехвачено исключение с помощью метода. Некорректное значение.");
        }
    }

    public static void exceptionTwo(int x) throws NegativeArraySizeException{
        if (x < 0) {
            throw new NegativeArraySizeException("Перехвачено исключение с помощью метода. Размер массива должен быть натуральным числом");
        }
    }

}
