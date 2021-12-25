//3. Напишите программу, в которой создается двумерный массив,
// который выводит прямоугольник из цифр 2;

package lab4;

public class Ex3 {
    public static void main(String[] args) {
        int[][] TwoArray = new int [4] [6];
        int i;
        int j;

        for (i=0; i<4; i++)
            for (j=0; j<6; j++) {
                TwoArray [i] [j] = 2;
            }

        for (i=0; i<4; i++) {
            for (j=0; j<6; j++)
                System.out.print(TwoArray [i] [j] + " ");
            System.out.println();
        }
    }
}