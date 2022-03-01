package lab6.number7;

public class SymbolCodes {
    public static int[] arrayOfCodes(char[] chr){
        int[] result = new int[chr.length];

        for(int i = 0; i < chr.length; i++){
            result[i] = chr [i];
            System.out.print(" " + result[i]);
        }
        return result;
    }

}
