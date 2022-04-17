package lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_1Main {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Задание 3.");
            System.out.print("Введите размер массива: ");
            int s = input.nextInt();
            Task3_1.exceptionTwo(s);
            byte[] array = new byte[s];
            System.out.println("Введите " + s + " чисел от -128 до 128");
            int p;
            for (p = 0; p < array.length; p++) {
                array[p] = input.nextByte();
                Task3_1.exceptionOne(array[p]);}
            Task3_1.summ(array);
        } catch (NegativeArraySizeException e) {
            System.out.println("Исключение: " + e);
        } catch (InputMismatchException ee) {
            System.out.println("Исключение: " + ee);
        }
    }
}
