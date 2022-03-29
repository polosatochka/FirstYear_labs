package lab8.task3;

public class Array {

    static int[] arr = new int[10];

    public Array() {}

    public void printElements(int i) {
        if (i == 0) {
            return;}
        else {
            printElements(i - 1);
            System.out.println("[" + (i - 1) + "]" + arr[i - 1]);}
    }

    public static int fillElements(int i) {
        int result;
        if (i == 0) {
            return 0;}
        else {
            result = fillElements(arr[i-1] = i-1);
            return result;}
    }
}
