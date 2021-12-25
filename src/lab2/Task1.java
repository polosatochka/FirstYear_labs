package lab2;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        int result = number % 3;
        if (result == 0) {
            System.out.println("Это число делится на три. ");
        }
        else {
            System.out.println("Это число не делится на три. ");
        }

    }
}