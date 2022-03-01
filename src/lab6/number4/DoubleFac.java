package lab6.number4;

public class DoubleFac {

    private static int evenfact = 1;
    private static int oddfact = 1;


    public static void factorial (int n) {
        if (n >= 0 && n % 2 == 0){
            for (int i = 2; i <= n; i += 2) {
                evenfact = evenfact * i;
            }
            System.out.println("Двойной факториал числа " + n + " равен: " + evenfact);
        }
        if (n >= 0 && n % 2 != 0) {
            for (int j = 1; j <= n; j += 2) {
                oddfact = oddfact * j;
            }
            System.out.println("Двойной факториал числа " + n + " равен: " + oddfact);
        }
        if (n < 0){
            System.out.println("Введите натуральное число (целое и положительное).");
        }
    }
}
