package lab9;

import java.util.InputMismatchException;
import java.util.Random;

public class Task2_1 {

    static int[][] mtr = new int[4][5];
    static int i;
    static int j;

    public static void createMatrix() {
        Random random = new Random();
        for (i = 0; i < mtr.length; i++) {
            for (j = 0; j < 5; j++) {
                mtr[i][j] = random.nextInt(200);
                System.out.println("[" + i + "][" + j + "]=" + mtr[i][j]); }
        }
    }

    public static void showColumn(int y) {
        for (int x = 0; x < mtr.length; x++) {
            System.out.println("[" + x + "][" + y + "]="+mtr[x][y]);
        }
    }

    public static void exceptOne(int x) throws InputMismatchException {
        if (0 > x || x > 5) {
            throw new InputMismatchException("Перехвачено исключение с помощью метода. Введите число.");
        }
    }

    public static void exceptTwo(int y) throws ArrayIndexOutOfBoundsException{
        if (0 > y || y > 5){
            throw new ArrayIndexOutOfBoundsException("Перехвачено исключение с помощью метода. Вы превысили размер массива");
        }
    }
}
