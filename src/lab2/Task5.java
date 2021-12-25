package lab2;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        int result = number / 1000 % 1000;
        System.out.println("В вашем числе " + result + " тысяч. ");
    }
}
