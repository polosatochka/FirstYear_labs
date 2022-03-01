package lab6.number5;

public class SumOfSquareNumbers {

    private static int sum = 0;
    private static int result;

    public static int squareSum(int m) {
        if (m >= 0)
            for (int i = 1; i <= m; ++i){
                sum = sum + (i * i);}
        else
            System.out.println("Введите натуральное число (целое и положительное).");
        return sum;}

    public static void checking(int n) {
        if (n > 0) {
            result = ((n * (n + 1) * (2 * n + 1)) / 6);
            if (result == sum)
                System.out.println("Сумма квадратов натуральных чисел от 1 до " + n + " = " + result);
            else
                System.out.println("Результаты не совпадают");
        }
    }
}
