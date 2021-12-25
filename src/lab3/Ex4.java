package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int one = in.nextInt();
        System.out.print("Введите еще одно целое число: ");
        int two = in.nextInt();

        int [] nums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            nums[0] = one;
            nums[1] = two;
        }

        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length ;) {
            System.out.println("Наименьшее из чисел = " + nums[0]);
            break;
        }
        for (int i = 1; i < nums.length;){
            System.out.println("Наибольшее из чисел = " + nums[1]);
            break;
        }
    }
}
