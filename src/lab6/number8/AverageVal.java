package lab6.number8;

public class AverageVal {

    public static void averageCount(int [] arr){
        float aver = 0;
        float sum = 0;

        for(int x : arr){
            aver = (float)((sum +=x)/ arr.length);
        }
        System.out.println("Среднее значение для элементов массива:" + aver);
    }
}
