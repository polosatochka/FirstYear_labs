package lab8.task2;

public class Binary {

    public static String binary(int num){

        String result;

        if(num <= 1)
            return String.valueOf(num);
        else{
            result = binary(num/2) + binary(num%2);
            return result;}
    }
}
