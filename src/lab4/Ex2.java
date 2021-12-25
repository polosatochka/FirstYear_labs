//2. Напишите программу, которая выводит в консольное окно прямоугольный треугольник;

package lab4;

public class Ex2 {
    public static void main(String[] args) {
        int fig = 5; // число строк которое необходимо вывести
        int i; // переменная задает число, необходимое для расчета количества строк
        int j; // переменная задает число, для увеличения символов в строке
        for (i = 1; i <= fig; i++) {
            System.out.println(" ");
            System.out.print("строка: " + i + "   ");

            for (j = 0; j < i; j++)
                System.out.print("*");
        }
    }
}