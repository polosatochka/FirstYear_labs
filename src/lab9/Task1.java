package lab9;

public class Task1 {

    public static void averageValue(int[] num) {

        double value = 0;
        int sum = 0;

        for (int x : num) {
            value = ((double)(sum += x) / num.length);
        }
        System.out.println("Среднее значение для элементов массива:" + value);
    }
}
