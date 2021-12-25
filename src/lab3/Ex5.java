package lab3;

import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Давайте сложим несколько чисел. ");
        System.out.println("Каждое из них при делении по модулю на 5 дает 2, а при делении по модулю на 3 дает 1.");
        System.out.print("Введите сколько чисел вы хотите сложить: ");
        int num = in.nextInt();

        int[] nums = new int[num];
        int a, i;

        for(a=7, i=0; i<nums.length; i++) {
            nums[i] = a;
            a+=15;
        }

        for(i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        int sum = 0;
        for(int x : nums) {
            sum+=x;
        }
        System.out.println(" ");
        System.out.println("Сумма равна: " + sum);
    }
}
