//Напишите программу, в которой создается двумерный числовой массив
// и этот массив заполняется «змейкой»:
// сначала первая строка (слева направо),
// затем последний столбец (снизу вверх),
// вторая строка (слева направо) и так далее.

package lab4;

import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве: ");
        int m = in.nextInt();

        System.out.println("Введите количество столбцов в массиве: ");
        int n = in.nextInt();

        int[][] snake = new int[m][n];

        int i, j;
        int k = 1;


        for (i = 0; i < snake.length; i++) {
            System.out.println();
            if (i % 2 == 0) {
                for (j = 0; j < snake.length; j++) {
                    snake[i][j] = k;
                    k++;
                }
            }
            else {
                for (j = n - 1; j >= 0; j--) {
                    snake[i][j] = k;
                    k++;
                }
            }
        }

        for(i=0; i< snake.length; i++){
            System.out.println();
            for(j = 0; j < snake.length; j++){
                System.out.print(snake[i][j]+" ");
            }
        }
    }
}