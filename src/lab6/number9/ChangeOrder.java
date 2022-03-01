package lab6.number9;

public class ChangeOrder {

    public static char[] reverse(char [] items){

        char[] newchr = new char[items.length];

        for(int i = 0, j = newchr.length - 1; i < items.length; i++, j--){
            newchr[i] = items [j];
            System.out.print(" " + newchr[i]);
        }
        return newchr;
    }
}
