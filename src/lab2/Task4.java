package lab2;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        if(number>=5 && number<=10)
        {
            System.out.println("Ваше число 5<= " + number + " <=10");
        }
        else{
            System.out.println("Введите число от 5... до ...10 включительно. ");
        }
    }
}
