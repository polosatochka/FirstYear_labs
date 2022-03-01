package lab6.number5_1;

public class SumRecursion {
    private static int verify;
    private static double result = 0;

    public static double recursiveSum(int n) {
        if (n >= 0) {
            if (n == 1) return 1;
            result = recursiveSum(n - 1) + (Math.pow(n,2));}
        else
            System.out.println("Введите натуральное число (целое и положительное).");

        return result;}

    public static void check(int m) {
        if (m > 0) {
            verify = ((m * (m + 1) * (2 * m + 1)) / 6);
            if (verify == result)
                System.out.println("Сумма квадратов натуральных чисел от 1 до " + m + " = " + verify);
            else
                System.out.println("Результаты не совпадают");}
    }

}
