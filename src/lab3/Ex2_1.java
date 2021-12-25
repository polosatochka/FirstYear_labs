package lab3;

import java.util.Scanner;
public class Ex2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input any day: ");
        String day = in.nextLine();

        int number = 0;


        if ("Monday".equals(day))
            number = 1;
        else if(number == 1)
            System.out.println("Day number " + number);
        else if ("Tuesday".equals(day))
            number = 2;
        else if ("Wednesday".equals(day))
            number = 3;
        else if ("Thursday".equals(day))
            number = 4;
        else if ("Friday".equals(day))
            number = 5;
        else if ("Saturday".equals(day))
            number = 6;
        else if ("Sunday".equals(day))
            number = 7;
        else
            System.out.println("This day doesn't exist ");


        if (number == 1)
            System.out.println("Day number " + number);
        else if (number == 2)
            System.out.println("Day number " + number);
        else if (number == 3)
            System.out.println("Day number " + number);
        else if (number == 4)
            System.out.println("Day number " + number);
        else if (number == 5)
            System.out.println("Day number " + number);
        else if (number == 6)
            System.out.println("Day number " + number);
        else if (number == 7)
            System.out.println("Day number " + number);
    }
}