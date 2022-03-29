package lab8.task2;

import java.util.Scanner;

import static lab8.task2.Binary.binary;

public class MainBinary {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();

        System.out.println((binary(number)));
    }
}
