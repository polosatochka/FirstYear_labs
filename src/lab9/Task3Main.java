package lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Задание 3.");
            System.out.print("Введите размер массива: ");
            int s = input.nextInt();
            byte[] array = new byte[s];
            System.out.println("Введите " + s + " чисел от -128 до 128");
            int p;
            for (p = 0; p < array.length; p++) {
                array[p] = input.nextByte();}
            Task3.sum(array);
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не верное значние");
        } catch (NegativeArraySizeException ee) {
            System.out.println("Размер массива должен быть натуральным числом, т.е. целым и положительным");
        }
    }
}
