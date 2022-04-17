package lab9;

public class Task3 {

    public static void sum(byte[] nums){
        double value = 0;
        double s = 0;
        for(byte x : nums){
            value = (s += x);
        }
        System.out.println("Сумма элементов массива = " + value);
    }
}
