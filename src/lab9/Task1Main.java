package lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Задание 1.");
            System.out.print("Введите размер массива: ");
            int size = in.nextInt();
            int[] arr = new int[size];
            int k = 0;
            int p;
            System.out.println("Введите "+ size + " натуральное число (целое и > 0): ");
            for (p = 0; p < arr.length; p++) {
                System.out.print(": ");
                k = in.nextInt();
                arr[p] = k; }
            if (k <= 0) {
                throw new InputMismatchException("Вы ввели число < или = 0 ");
            }
            Task1.averageValue(arr);
        }catch(InputMismatchException e){
            System.out.println("Вы ввели не натуральное число");
        }catch (NegativeArraySizeException ex){
            System.out.println("Размер массива должен быть натуральным числом, т.е. целым и положительным");
        }
    }
    }

