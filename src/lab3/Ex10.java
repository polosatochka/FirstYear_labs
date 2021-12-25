package lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива:" );
        int Size = in.nextInt();

        System.out.println("Размер массива равен "+ Size);
        int[] nums = new int[Size];

        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }

        Integer[] backwards = new Integer[Size];

        for(int i = 0; i < nums.length; i++) {
            backwards[i] = nums [i];
        }

        Arrays.sort(backwards, Collections.reverseOrder());
        System.out.println("Произведена сортировка массива в порядке убывания");

        for(int i = 0; i < backwards.length; i++) {
            System.out.println("Элемент массива [" + i + "] = " + backwards[i]);
        }
    }
}
