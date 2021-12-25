package lab3;

import java.util.Scanner;
public class Ex3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел Фибоначчи вы хотите получить?");
        System.out.print("Введите значение > или = 2: ");
        int fib = in.nextInt();


        int a = 1;
        int b = 1;

        System.out.print("1 1 ");


        while(fib>0) {

            int c = a + b;
            a = b;
            b = c;
            fib--;

            System.out.print(c + " ");
        }

    }
}