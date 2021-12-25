//Напишите программу, в которой создается двумерный массив,
// который выводит прямоугольный треугольник;

package lab4;

public class Ex4 {
    public static void main(String[] args) {
        int[][] TwoArray = new int[7][8];
        int i;
        int j;

        for (i = 1; i <= 5; i++) {
            for (j = 0; j < 7; j++) {
                TwoArray[i][j] = 2;
            }
        }

        for (i = 1; i <= 5; i++) {
            System.out.println();
            for (j = 0; j < i; j++) {
                System.out.print(TwoArray[i][j]);
            }
        }
    }
}