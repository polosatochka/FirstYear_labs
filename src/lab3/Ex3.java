package lab3;

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел Фибоначчи вы хотите получить? Введите значение > или = 2:");
        int fib = in.nextInt();

        System.out.println("Вы получили " + fib + " чисел Фибоначчи.");
        int[] nums = new int[fib];
        nums[0] = 1;
        nums[1] = 1;

        for(int i = 2; i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i-2];
        }

        for(int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i] + " ");
        }
    }
}
