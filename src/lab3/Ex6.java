package lab3;

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        boolean t;

        if(size<=0) {
            t = true;
            System.out.println("Неверный размер массива! Попробуй снова.");
            if(t) return;
        }

        System.out.println("Размер массива равен " + size);

        int[] nums = new int[size];
        int a, i;

        for(a = 7, i = 0; i< nums.length; i++) {
            nums[i] = a;
            a += 5;
        }

        System.out.println("Числа в массиве:");

        for(i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
