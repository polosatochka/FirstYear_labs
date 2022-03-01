package lab6.number4_1;

public class DoubleFactorial {

    public static int factorial(int n) {
        int result = 0;

        if (n >= 0 && n % 2 == 0) {
            if (n == 0) return 1;
            result = factorial(n - 2) * n;}

        if(n >= 0 && n % 2 != 0){
            if(n == 1) return 1;
            result = factorial(n-2)*n;}

        if (n < 0){
            System.out.println("Введите натуральное число (целое и положительное).");}
        return result;
    }
}
