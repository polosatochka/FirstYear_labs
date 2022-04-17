package lab9;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task2Main {

    public static void main(String[] args) {
        Task2.createMatrix();
        System.out.println("------------------");
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите номер столбца от 0 до 5: ");
            int val = input.nextInt();
            Task2.showColumn(val);
        } catch (ArrayIndexOutOfBoundsException ee) {
            System.out.println("Вы превысили размер массива");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Введите число");
        }
    }
}
