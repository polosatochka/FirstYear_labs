package lab9;

import java.util.Random;

public class Task2 {

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
}