package lab9;

import java.util.InputMismatchException;

public class Task1_2 {

    public static void exceptionOne(int vals) throws InputMismatchException {
        if (vals <= 0) {
            throw new InputMismatchException("Перехвачено исключение с помощью метода. Вы ввели не натуральное число");
        }
    }

    public static void averageVal(int[] num) {
        double value = 0;
        int sum = 0;
        for (int x : num) {
            value = ((double) (sum += x) / num.length);
        }
        System.out.println("Среднее значение для элементов массива:" + value);
    }


    public static void exceptTwo(int p) throws NegativeArraySizeException {
            if (p < 0) {
                throw new NegativeArraySizeException("Перехвачено исключение с помощью метода. Размер массива должен быть натуральным числом, т.е. целым и положительным");
            }
    }
}
