//5. Напишите программу, в которой создается двумерный целочисленный массив.
// Он заполняется случайными числами.
// Затем в этом массиве строи и столбцы меняются местами:
// первая строка становится первым столбцом,
// вторая строка становиться вторым столбцом и так далее.
// Например, если исходный массив состоял из 3 строк и 5 столбцов,
// то в итоге получаем массив из 5 строк и 3 столбцов.

package lab4;


import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        int[][] TwoDim = new int[3][5];

        int i;
        int j;

        Random random = new Random();
        for (i = 0; i < TwoDim.length; i++) {
            System.out.println();
            for (j = 0; j < 5; j++) {
                TwoDim[i][j] = random.nextInt(200);
                System.out.print("[" + i + "][" + j + "] = " + TwoDim[i][j] + "  ");
            }
        }

        System.out.println();

        for (i = 0; i < 5; i++) {
            System.out.println();
            for (j = 0; j < TwoDim.length; j++) {
                System.out.print("["+j+"]["+i+"] = " + TwoDim[j][i] + "  ");
            }
        }
    }
}
