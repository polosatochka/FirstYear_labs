package lab3;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = in.nextInt();
        System.out.print("Введите еще одно целое число: ");
        int b = in.nextInt();

        while(a < b) {
            System.out.println("Наименьшее из чисел: " + a);
            break;
        }

        while(b < a) {
            System.out.println("Наименьшее из чисел: " + b);
            break;
        }

        while(a > b) {
            System.out.println("Наибольшее из чисел: " + a);
            break;
        }

        while(b > a) {
            System.out.println("Наибольшее из чисел: " + b);
            break;
        }
    }
}