package lab3;

public class Ex7 {
    public static void main(String[] args) {
        int size = 10;
        char[] letters = new char [size];
        char l1, i;

        for(l1 ='a' , i = 0; i < 10; i++) {
            letters[i] = l1;
            l1 +=2;
        }

        System.out.println("Буквы в массиве:");

        for(i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }

        System.out.println(" ");

        for(i = 9; i < letters.length; i--) {
            System.out.print(letters[i] + " ");

        }

    }
}
