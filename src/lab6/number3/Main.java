package lab6.number3;

public class Main {
    public static void main(String[] args) {
        CountValue.minMaxAverage(23);
        CountValue.minMaxAverage(2, 6, 4);
        CountValue.minMaxAverage();


        int [] a = { 24 };
        int [] b = { 1, 3, 5};
        int [] c = {};

        CountValue.minMaxAverage2(a);
        CountValue.minMaxAverage2(b);
        CountValue.minMaxAverage2(c);
    }
}
