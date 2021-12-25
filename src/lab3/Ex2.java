package lab3;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название дня недели/Input any day: ");
        String day = in.nextLine();

        int number;
        switch(day) {
            case "Понедельник":
            case "Monday":
                number = 1;
                System.out.println("День номер/Day number " + number);
                break;
            case "Вторник":
            case "Tuesday":
                number = 2;
                System.out.println("День номер/Day number " + number);
                break;
            case "Среда":
            case "Wednesday":
                number = 3;
                System.out.println("День номер/Day number " + number);
                break;
            case "Четверг":
            case "Thursday":
                number = 4;
                System.out.println("День номер/Day number " + number);
                break;
            case "Пятница":
            case "Friday":
                number = 5;
                System.out.println("День номер/Day number " + number);
                break;
            case "Суббота":
            case "Saturday":
                number = 6;
                System.out.println("День номер/Day number " + number);
                break;
            case "Воскресенье":
            case "Sunday":
                number = 7;
                System.out.println("День номер/Day number " + number);
                break;
            default:
                System.out.println("День не существует./This day doesn't exist.");

        }
    }
}