package lab3;

import java.util.Scanner;
public class Ex5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Давайте сложим несколько чисел. ");
        System.out.println("Каждое из них при делении по модулю на 5 дает 2, а при делении по модулю на 3 дает 1.");
        System.out.print("Введите сколько чисел вы хотите сложить: ");
        int num = in.nextInt();

        int a = 7;

        System.out.print("Скадываем " + num + " числа: " + a );

        int sum = 7;

        while (--num>0) {

            a += 15;
            sum = sum + a;
            System.out.print(" " + a);
        }
        System.out.println(" ");
        System.out.println("Сумма равна: " + sum);
    }
}