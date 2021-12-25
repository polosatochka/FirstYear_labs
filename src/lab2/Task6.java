package lab2;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        String convert = Integer.toOctalString(number);
        System.out.println("Ваше число в восьмеричной системе счисления: " + convert);

        int result = number / 8;
        int result1 = result % 8;
        System.out.println("В восьмеричном представлении числа " + number + " вторая цифра справа " + result1);
    }
}
