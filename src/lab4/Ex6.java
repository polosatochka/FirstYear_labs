//Напишите программу, в которой создается и инициализируется двумерный числовой массив.
// Затем из этого массива удаляется строка и столбец
// (создается новый массив, в котором по сравнению с исходным удалена одна строка и один столбец).
// Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.


package lab4;

import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        int[][] arrayone = {
                {2, 6, 4, 8},
                {1, 3, 5, 7},
                {10, 12, 14, 16},
                {9, 11, 13, 15}};

        int i;
        int j;
        int a = 4;
        int b = 4;

        for (i = 0; i < arrayone.length; i++) {

            for (j = 0; j < arrayone[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arrayone[i][j] + " ");
            }
            System.out.println();
        }

        Random rand = new Random();

        int r, c;

        r = rand.nextInt(a - 1);
        c = rand.nextInt(b - 1);

        System.out.println("Удалить строку: " + r);
        System.out.println("Удалить столбец: " + c);

//Создание второго массива
        int[][] arraytwo = new int[a - 1][b - 1];

//Цикл, который пропускает строку и столбец
        int m = 0;

        for (i = 0; i < arrayone.length; i++) {
            if (i == r)
                continue;

            int n = 0;
            for (j = 0; j < arrayone[i].length; j++) {
                if (j == c)
                    continue;

                arraytwo[m][n] = arrayone[i][j];
                System.out.print("["+m+"]["+n+"] = "+arraytwo[m][n]);
                ++n;
            }
            ++m;
            System.out.println();
        }
    }
}