package lab3;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        int number = in.nextInt();

        String day;
        switch(number) {
            case 1:
                day = "is Monday";
                break;
            case 2:
                day = "is Tuesday";
                break;
            case 3:
                day = "is Wednesday";
                break;
            case 4:
                day = "is Thursday";
                break;
            case 5:
                day = "is Friday";
                break;
            case 6:
                day = "is Saturday";
                break;
            case 7:
                day = "is Sunday";
                break;
            default:
                day = "doesn't exist.";
        }
        System.out.println("The day " + day);
    }
}