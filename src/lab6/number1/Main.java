package lab6.number1;

public class Main {

    public static void main(String[] args) {
        CharToString info = new CharToString();
        info.setCharValue('A');
        info.showCharValue();

        info.setTxtValue("Happy New Year!");
        info.showTextValue();

        char [] letter = {'N'};
        info.setMassivValue(letter);
        info.showCharValue();

        char [] congratulate = {'M','e','r','r','y',' ','X','M','A','S'};
        info.setMassivValue(congratulate);
        info.showTextValue();
    }
}
