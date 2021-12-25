package lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex9 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива:" );
        int Size = in.nextInt();

        System.out.println("Размер массива равен "+ Size);
        int[] nums = new int[Size];

        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }

        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива"); // Сообщение пользователю "для красоты и понимания"

        for (int i = 0 ; i < nums.length ; i++ ) {
            System.out.println("Элемент массива [" + i + "] после сортировки = " + nums[i]);  // Сообщение пользователю "для красоты и понимания"
        }

        System.out.println();
        int minim = nums [0];


        for (int i=0; i<nums.length;i++) {
            if (nums [i] == minim) {
                System.out.println("минимальный элемент равен = ["+i+"] - " + nums[i]);
            }
        }
    }
}
