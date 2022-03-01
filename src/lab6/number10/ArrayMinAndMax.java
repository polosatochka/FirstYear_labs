package lab6.number10;

public class ArrayMinAndMax {

    public static int[] findValue(int...number){
        int min = number[0];
        int max = number[0];

        int[] minMax = {min, max};

        for(int i = 1; i < number.length; i++){
            if(number[i] < min){
                min = number[i];
                System.out.print(min);
            }
        }
        for(int j = 1; j < number.length; j++){
            if(number[j] > max){
                max = number[j];
                System.out.print(" " +max);
            }
        }
        return minMax;
    }
}
