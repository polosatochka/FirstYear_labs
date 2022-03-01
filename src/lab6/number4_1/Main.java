package lab6.number4_1;

public class Main {

    public static void main(String[] args) {

        System.out.print("Двойной 6 факториал = ");
        System.out.print(DoubleFactorial.factorial(6));

        System.out.println();

        System.out.print("Двойной 5 факториал = ");
        System.out.print(DoubleFactorial.factorial(5));

        System.out.println();
        DoubleFactorial.factorial(-7);

    }
}
