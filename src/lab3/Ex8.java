package lab3;

public class Ex8 {
    public static void main(String[] args) {
        int size = 10;
        char[] cletters = new char[size];
        char l1, i;

        for(l1 = 'B', i =0; i < cletters.length; i++) {
            cletters[i] = l1;
            l1 +=1;

            if(l1 == 69)
                l1+=1;
            else if (l1 == 73)
                l1+=1;
        }

        System.out.println("Буквы в массиве:");

        for(i = 0; i < cletters.length; i++) {
            System.out.print(cletters[i] + " ");
        }

    }
}