package lab2;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        if(number>10) {
            int result = number % 4;

            if (result == 0)
                System.out.println("Это число >10 и делится на 4. ");

            else
                System.out.println("Это число не делится на 4. ");
        }

        if (number < 10) {
            System.out.println("Введите число >10. ");
        }

    }
}