package lab2;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        int result = number % 5;
        int result1 = number % 7;

        if (result == 2) {
            System.out.println("Если " + number + ":5 , остаток равен 2. " );
        }
        else {
            System.out.println("Если " + number + ":5 , остаток не равен 2. ");
        }

        if (result1 == 1) {
            System.out.println("Если " + number + ":7 , остаток равен 1. ");
        }
        else {
            System.out.println("Если " + number + ":7 , остаток не равен 1. ");
        }
    }
}
