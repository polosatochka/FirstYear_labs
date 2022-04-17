package lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_1Main {

    public static void main(String[] args) {
        Task2_1.createMatrix();
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите номер столбца от 0 до 5: ");
            int val = input.nextInt();
            Task2_1.exceptTwo(val);
            Task2_1.exceptOne(val);
            Task2_1.showColumn(val);
        } catch (ArrayIndexOutOfBoundsException ee) {
            System.out.println("Исключение: " + ee);
        }catch (InputMismatchException e){
            System.out.println("Исключение: " + e);
        }
    }
}