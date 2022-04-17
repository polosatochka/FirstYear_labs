package lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_2Main {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Задание 1.");
            System.out.print("Введите размер массива: ");
            int s = in.nextInt();
            Task1_2.exceptTwo(s);
            int[] numbers = new int[s];
            System.out.println("Введите " + s + " натуральных чисел (целые и > 0).");
            int p;
            for (p = 0; p < numbers.length; p++) {
                numbers[p] = in.nextInt();
                Task1_2.exceptionOne(numbers[p]);}
            Task1_2.averageVal(numbers);
        }catch (InputMismatchException e){
            System.out.println("Исключение: " + e);
        }catch (NegativeArraySizeException ee){
            System.out.println("Исключение: " + ee);
        }
        }
    }
